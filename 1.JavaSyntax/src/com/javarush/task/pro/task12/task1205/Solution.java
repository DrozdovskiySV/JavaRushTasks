package com.javarush.task.pro.task12.task1205;

/* 
Метод деления
*/

public class Solution {

    public static void main(String[] args) {
        divide(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        divide(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        final Double pInf = Double.POSITIVE_INFINITY;
        final Double nInf = Double.NEGATIVE_INFINITY;
        if ((a>0 && b==0) || (a==pInf && b>=0 && !Double.isInfinite(b)) || (a==nInf && b<0 && !Double.isInfinite(b)))
            System.out.println(pInf);
        else if ((a<0 && b==0) || (a==pInf && b<0 && !Double.isInfinite(b)) || (a==nInf && b>=0 && !Double.isInfinite(b)))
            System.out.println(nInf);
        else if((a==0 && b==0) || Double.isNaN(a) || Double.isNaN(b) || (Double.isInfinite(a) && Double.isInfinite(b)))
            System.out.println(Double.NaN);
        else
            System.out.println(a/b);
    }
}
