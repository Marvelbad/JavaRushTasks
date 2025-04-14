package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        int byteData;
        int commaCount = 0;
        while ((byteData = inputStream.read()) != -1) {
            if (byteData == 44) {
                commaCount++;
            }
        }
        System.out.println(commaCount);
        reader.close();
        inputStream.close();
    }
}
