package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static List<Character> HEX = Arrays.asList('0', '1','2','3','4','5','6','7','8','9','A','B','C','D','E','F');


    /*
     * TVL
     * 待解元
     * 待解元: 31
     * 16进制输入流：32 01 00 AE 90 02 00 01 02 30 03 00 AB 32 31 31 02 00 32 33 33 01 00 CC
     * 32[待解元] 01 00[1为value长度] AE[walue]
     * 90[待解元] 02 00[2为value长度] 01 02[walue]
     * 30[待解元] 03 00[3为value长度] AB 32 31[walue]
     * 31[待解元] 02 00[2为value长度] 32 33[walue]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tag = scanner.nextLine().toUpperCase();
        String[] array = scanner.nextLine().toUpperCase().split(" ");
        int length = array.length;
        int index = 0;

        while (index < length) {

            // 拿待解元
            String t = array[index++];

            // 拿value的长度
            Integer len = transToTen(array[index].toCharArray());
            if (tag.equals(t)) {

                StringBuffer buffer = new StringBuffer();
                for (int i = 2; i < len + 2; i++) {
                    buffer.append(array[index + i] + " ");
                }
                String s = buffer.toString();
                System.out.println(s.substring(0, s.length() - 1));
                break;

            } else {
                index += (2 + len);
            }
        }
    }

    public static Integer transToTen(char[] chars){

        int num = 0;
        int length = chars.length;
        for (int i = length - 1; i >= 0; i--){
            num += Math.pow(16, length - i - 1) * HEX.indexOf(chars[i]);
        }

        return num;
    }
}
