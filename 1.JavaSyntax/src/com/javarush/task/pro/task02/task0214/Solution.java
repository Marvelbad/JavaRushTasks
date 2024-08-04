package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strOne = scanner.nextLine();
        String strTwo = scanner.nextLine();
        String strThree = scanner.nextLine();



        System.out.println(strThree);
        System.out.println(strTwo.toUpperCase());
        System.out.println(strOne.toLowerCase());


    }
}
