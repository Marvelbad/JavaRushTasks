package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ) {
            String line;
            List<String> words = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String word : parts) {
                    if (word.length() > 6) {
                        words.add(word);
                    }
                }
            }
            writer.write(String.join(",", words));
        }
    }
}
