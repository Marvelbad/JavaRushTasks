package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (BufferedReader input = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        ) {
            int counter = 0;
            char currentChar;
            int readValue;
            StringBuilder stringBuilder = new StringBuilder();
            while ((readValue = input.read()) != -1) {
                currentChar = (char) readValue;
                counter++;

                if (counter % 2 == 0) {
                    writer.write(currentChar);
                }
            }
        }
    }
}
