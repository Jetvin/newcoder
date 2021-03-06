package com.example.demo.service;

import java.util.Scanner;

public class HJ3 {

    /**
     * 题目描述
     *
     * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
     * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * 输入描述:
     *
     * 连续输入字符串(输入多次,每个字符串长度小于100)
     *
     * 输出描述:
     *
     * 输出到长度为8的新字符串数组
     *
     * 示例1
     * 输入
     * 复制
     *
     * abc
     * 123456789
     *
     * 输出
     * 复制
     *
     * abc00000
     * 12345678
     * 90000000
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char[] charArray = scanner.nextLine().toCharArray();
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < charArray.length; i++){

                if (i != 0 && i % 8 == 0){
                    System.out.println(buffer.toString());
                    buffer = new StringBuffer();
                    buffer.append(charArray[i]);
                }else {
                    buffer.append(charArray[i]);
                }

            }

            if (buffer.length() != 0){
                buffer.append("00000000");
                System.out.println(buffer.substring(0,8));
            }
        }
    }
}
