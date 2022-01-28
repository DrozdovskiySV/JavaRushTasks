package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(3));
        System.out.println(cube((long) 5634.567));
    }

    public static long cube(long val) {
        return val*val*val;
    }
}
