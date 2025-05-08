package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        ) {
            String line;
            List<Integer> numbers = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("(?<=\\s|^)\\d+(?=\\s|$)");
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    numbers.add(Integer.parseInt(matcher.group()));
                }
                for (int i = 0; i < numbers.size(); i++) {
                    writer.write(numbers.get(i).toString());
                    if (i != numbers.size() - 1) {
                        writer.write(" ");
                    }
                }
            }
        }
        console.close();
    }
}