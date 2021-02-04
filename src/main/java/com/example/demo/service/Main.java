package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /*
     *
     * 计算字符出现此时，输出按次数降序，相同次数按字母自然顺序
     * xyxyXX
     * x:2;X:2;y:2
     *
     * abababb
     * b:4;a:3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.nextLine().toCharArray();
        int length = charArray.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++){
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }


        StringBuffer buffer = new StringBuffer();
        String[] array = new String[length];
        for (int i = 0; i < length; i++){
            array[i] = "";
        }

        map.forEach((key, value) -> {
            array[value] += String.valueOf(key);
        });

       for (int i = length - 1; i >= 0; i--){

           if (!"".equals(array[i])){
               String str = array[i];
               if (str.length() > 1){
                   char[] strCharArray = str.toCharArray();
                   for (int k = 0; k < strCharArray.length; k++){
                       for (int n = k + 1; n < strCharArray.length; n++){
                           if (String.valueOf(strCharArray[k]).compareTo(String.valueOf(strCharArray[n])) > 0){
                               char temp = strCharArray[k];
                               strCharArray[k] = strCharArray[n];
                               strCharArray[n] = temp;
                           }
                       }
                   }
                   for (int k = 0; k < strCharArray.length; k++ ){
                       buffer.append( String.valueOf(strCharArray[k])+ ":" + i + ";");
                   }
               }else {
                   buffer.append( str+ ":" + i + ";");
               }
           }
       }
        System.out.println(buffer.toString());
    }
}
