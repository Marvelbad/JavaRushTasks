package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String str = console.readLine();
        console.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(str))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int count = 0;
                for (String word : parts) {
                    if (words.contains(word)) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }
        }
    }
}
