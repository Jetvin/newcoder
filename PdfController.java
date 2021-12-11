package com.example.demo.controller;

import com.itextpdf.text.pdf.BaseFont;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.servlet.http.HttpServletResponse;
import java.io.StringWriter;
import java.util.HashMap;

@Controller
public class PdfController {

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private Configuration configuration;

    @ResponseBody
    @GetMapping("/downloadPdf")
    public void downloadPdf(){

        try {

            Template template = configuration.getTemplate("pdf.ftl");
            StringWriter writer = new StringWriter();
            template.process(new HashMap<>(), writer);
            writer.flush();
            String htmlTmpStr = writer.toString();
            System.out.println(htmlTmpStr);

            String fileName = System.currentTimeMillis() + ".pdf";
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);


            ITextRenderer renderer = new ITextRenderer();
            ITextFontResolver fontResolver = renderer.getFontResolver();
            fontResolver.addFont("font/times.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            fontResolver.addFont("font/Microsoft YaHei.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);

            renderer.setDocumentFromString(htmlTmpStr);
            renderer.layout();

            renderer.createPDF(response.getOutputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/pdfView")
    public String pdfView(Model model){
        return "pdf";
    }
}
