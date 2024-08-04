package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println("Thank you, you entered number: " + number);
        }   else {
            System.out.println("Sorry, you entered not number");
            scan.close();
        }

    }
}
