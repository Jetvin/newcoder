package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HJ5 {

    /**
     * 题目描述
     *
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
     * 输入描述:
     *
     * 输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，请参考帖子https://www.nowcoder.com/discuss/276处理多组输入的问题。
     *
     * 输出描述:
     *
     * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
     *
     * 示例1
     * 输入
     * 复制
     *
     * 0xA
     * 0xAA
     *
     * 输出
     * 复制
     *
     * 10
     * 170
     */

    private static List<String> HEX = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char[] charArray = scanner.nextLine().substring(1).toCharArray();
            int number = 0;
            for (int i = charArray.length - 1; i > 0; i--){
                int index = HEX.indexOf(String.valueOf(charArray[i]));
                number += Math.pow(16, charArray.length - 1 - i) * index;
            }
            System.out.println(number);
        }
    }
}
