package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        ) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase("world")) {
                        wordCount++;
                    }
                }
            }
                System.out.println(wordCount);
        }
    }
}
