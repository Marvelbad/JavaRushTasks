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
        grades.put("John", 4.85);
        grades.put("Zaur", 4.86);
        grades.put("Jack", 4.83);
        grades.put("Tom", 4.82);
        grades.put("Alex", 4.65);
    }
}
