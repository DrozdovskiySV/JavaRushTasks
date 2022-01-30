package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Name1 Surname1",4.51d);
        grades.put("Name2 Surname2",4.52d);
        grades.put("Name3 Surname3",4.53d);
        grades.put("Name4 Surname4",4.54d);
        grades.put("Name5 Surname5",4.55d);
    }
}
