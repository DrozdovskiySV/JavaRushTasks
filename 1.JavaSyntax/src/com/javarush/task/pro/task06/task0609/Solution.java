package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(ninthDegree((long) 1.5));
        System.out.println(ninthDegree(2));
        System.out.println(ninthDegree(4678));
    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long val) {
        return cube(cube(val));
    }
}
