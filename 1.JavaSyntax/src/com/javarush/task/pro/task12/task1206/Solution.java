package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет ново33й фичей." +
                "Только не говорите никому, что о555на возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int cntDig = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) cntDig++;
        }
        return cntDig;
    }

    public static int countLetters(String string) {
        int cntLet = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) cntLet++;
        }
        return cntLet;
    }

    public static int countSpaces(String string) {
        int cntSpc = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) cntSpc++;
        }
        return cntSpc;
    }
}
