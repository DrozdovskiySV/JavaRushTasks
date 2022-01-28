package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    // дописывает двоичную запись нулями слева до кол-ва символов кратного 4
    public static String padToBinary(String str) {
        while (str.length()%4 != 0) {
            str = "0" + str;
        }
        return str;
    }

    // преобразовать 2-ичное число к 16-ричному виду
    public static String toHex(String binaryNumber) {
        if (binaryNumber == "" || binaryNumber == null) return "";
        // любой символ, кроме 0 или 1, то метод возвращает пустую строку
        for (int i = 0; i < binaryNumber.length(); i++) {
            char binChar = binaryNumber.charAt(i);
            if (binChar != '0' && binChar != '1') return "";
        }

        String resHexNum = "";
        binaryNumber = padToBinary(binaryNumber); // дописываем нулями слева
        for (int i = 0; i < (int) binaryNumber.length()/4; i++) { // проходим по двоичному числу четверками
            String binNumPart = binaryNumber.substring(i*4,(i+1)*4);
            int digit = 0;
            int decNum = 0;
            for (int j = 0; j < binNumPart.length(); j++) {
                if ((binNumPart.charAt(binNumPart.length()-j-1)) == '0') digit = 0; else digit = 1;
                decNum = decNum + digit * (int) Math.pow(2,j);
            }
            resHexNum = resHexNum + HEX.charAt(decNum);
        }

        return resHexNum;
    }

    // преобразовать 16-ричное число к двоичному виду
    public static String toBinary(String hexNumber) {
        if (hexNumber == "" || hexNumber == null) return "";
        String resBinNum = "";
        //Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.
        for (int i = 0; i < hexNumber.length(); i++) {
            int decNum = HEX.indexOf(hexNumber.charAt(i)); // число от 0 до 15 включительно - представление очередного символа из 16-ричной формы числа
            if (decNum == -1) return ""; //любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.

            // преобразовываем к двоичному представлению
            String binNum = "";
            if (decNum == 0) binNum = "0";
            while(decNum != 0) {
                binNum = decNum%2 + binNum;
                decNum = decNum / 2;
            }

            // дописываем двоичное число четверками цифр
            resBinNum = resBinNum + padToBinary(binNum);

        }

        return resBinNum;
    }
}
