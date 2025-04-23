package com.javarush.task.task18.task1817;

import java.io.*;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File path = new File(args[0]);

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            {
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
                String text = builder.toString();
                int charCount = text.length();
                int allSpaces = text.replaceAll("[^ ]", "").length();
                double percentage = (double) allSpaces / charCount * 100;
                double rounded = Math.round(percentage * 100.0) / 100.0;

                System.out.println(rounded);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
