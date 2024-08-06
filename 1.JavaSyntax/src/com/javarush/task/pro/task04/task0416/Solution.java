package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int banka = scanner.nextInt();
        int peopleQuantity = scanner.nextInt();

        double result = banka * 1.0 / peopleQuantity;
        System.out.println(result);
    }
}