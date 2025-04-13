package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                int minByte = 256;
                int data;
                while ((data = inputStream.read()) > 0) {
                    if (data < minByte) minByte = data;
                }
                System.out.println(minByte);
            }
        }
    }
}
