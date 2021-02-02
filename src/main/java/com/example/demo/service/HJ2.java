package com.example.demo.service;

import java.util.Scanner;
import java.util.HashMap;

public class HJ2 {

    /**
     * 题目描述
     *
     * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。
     * 输入描述:
     *
     * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
     *
     * 输出描述:
     *
     * 输出输入字符串中含有该字符的个数。
     *
     * 示例1
     * 输入
     * 复制
     *
     * ABCabc
     * A
     *
     * 输出
     * 复制
     *
     * 2
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String upperStr = input.toUpperCase();

        char c = sc.next().toUpperCase().charAt(0);

        int ans = checkNum(upperStr, c);

        System.out.print(ans);
    }

    private static int checkNum(String str, char c){
        int res = 0;

        int len = str.length();
        HashMap<Character, Integer> map= new HashMap<> ();
        for(int i = 0; i < len; i++){
            char cur = str.charAt(i);
            map.put(cur, map.getOrDefault(cur, 0)+1);
        }

        if(!map.containsKey(c)){
            return res;
        } else {
            res = map.get(c);
            return res;
        }
    }
}
