package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner scanner = new Scanner(System.in);
        //Запрос температуры
        int temp = scanner.nextInt();
         if(temp < 0) {
             System.out.println("на улице холодно");
         } else {
             System.out.println("на улице тепло");
         }
         scanner.close();
    }
}
