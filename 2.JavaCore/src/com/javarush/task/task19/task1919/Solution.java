package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))
        ) {
            TreeMap<String, Double> persons = new TreeMap<>();
            String line;
            while((line = reader.readLine()) != null) {
              String[] parts = line.split(" ");
              persons.merge(parts[0], Double.parseDouble(parts[1]), Double::sum);
            }
            for (Map.Entry<String, Double> entry : persons.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
