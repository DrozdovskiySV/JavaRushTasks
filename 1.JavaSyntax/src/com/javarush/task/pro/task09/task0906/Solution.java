package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 10;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "0111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        String binNum = "";
        while(decimalNumber != 0) {
            binNum = decimalNumber%2 + binNum;
            decimalNumber = decimalNumber / 2;
        }
        return binNum;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == "" || binaryNumber == null) return 0;
        int decNum = 0;
        int digit = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            if ((binaryNumber.charAt(binaryNumber.length()-i-1)) == '0') digit = 0; else digit = 1;
            //decNum = decNum + (((binaryNumber.charAt(i)) == '0') ? 0 : 1) * (int) Math.pow(2,i);
            decNum = decNum + digit * (int) Math.pow(2,i);
        }
        return decNum;
    }
}
