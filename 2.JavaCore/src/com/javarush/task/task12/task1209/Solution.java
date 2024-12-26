package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        min(10,5);
        min(150L, 200L);
        min(2.5, 3.8);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }
}
