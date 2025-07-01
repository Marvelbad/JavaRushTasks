package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String strConsole = console.readLine();
        console.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(strConsole))
        ) {
            String str;
            while ((str = reader.readLine()) != null) {
            StringBuilder reverseStr = new StringBuilder(str);
                String result = reverseStr.reverse().toString();
                System.out.println(result);
            }
        }
    }
}
