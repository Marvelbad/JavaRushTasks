package com.javarush.task.jdk13.task34.task3402;

/* 
Факториал с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.factorial(9));     //362880
        System.out.println(solution.factorial(0));     //1
        System.out.println(solution.factorial(1));     //1
    }

    public long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n -1);
    }
}