package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        do {
            str = scanner.nextLine();
        }
        while (!str.equals("exit"));
    }
}