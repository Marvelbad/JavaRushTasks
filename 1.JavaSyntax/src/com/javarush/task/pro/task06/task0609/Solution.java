package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        long number = 2;
        long result = ninthDegree(number);
        System.out.println(result);
    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long a) {
        long firstCube = cube(a);
        return cube(firstCube);
    }
}
