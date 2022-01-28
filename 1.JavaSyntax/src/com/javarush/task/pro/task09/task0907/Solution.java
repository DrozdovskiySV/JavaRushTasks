package com.javarush.task.pro.task09.task0907;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        String hexNum = "";
        while(decimalNumber != 0) {
            hexNum = HEX.charAt(decimalNumber%16) + hexNum;
            decimalNumber = decimalNumber / 16;
        }
        return hexNum;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == "" || hexNumber == null) return 0;
        int decNum = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decNum = 16*decNum + HEX.indexOf(hexNumber.charAt(i));
        }
        return decNum;
    }
}
