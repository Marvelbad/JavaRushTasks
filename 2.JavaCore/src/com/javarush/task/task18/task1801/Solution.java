package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                int max = 0;
                int data;
                while ((data = inputStream.read()) != -1) {
                    if (data > max) max = data;
                }
                System.out.println(max);
            }
        }
    }
}
