package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long number = 2;
        long result = cube(number);
        System.out.println(result);
    }
    public static long cube(long number) {
        return number * number * number;
    }
}
