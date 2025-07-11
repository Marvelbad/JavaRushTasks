package com.javarush.task.jdk13.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {

    }

    public void recurse(int n) {
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i + " ");
                recurse(n / i);
                break;
            }
            i++;
        }
    }
}
