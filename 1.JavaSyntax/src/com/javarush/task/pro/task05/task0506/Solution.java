package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    //public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}