package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        boolean isEven = false;

        while (scanner.hasNextInt()) {
            int curNum = scanner.nextInt();
            if (curNum % 2 == 0) {
                isEven = true;
                if (curNum > maxNumber) {
                    maxNumber = curNum;
                }
            }
        }

        if (isEven) {
            System.out.println(maxNumber);
        }   else {
            System.out.println(Integer.MIN_VALUE);
        }
    }
}