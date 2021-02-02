package com.example.demo.service;

import java.util.Scanner;

public class HJ1 {

    /**
     * 题目描述
     *
     * 计算字符串最后一个单词的长度，单词以空格隔开。
     * 输入描述:
     *
     * 输入一行，代表要计算的字符串，非空，长度小于5000。
     *
     * 输出描述:
     *
     * 输出一个整数，表示输入字符串最后一个单词的长度。
     *
     * 示例1
     * 输入
     * 复制
     *
     * hello nowcoder
     *
     * 输出
     * 复制
     *
     * 8
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] parts = str.split(" ");
        System.out.println(parts[parts.length - 1].length());
    }
}
