package com.javarush.task.task19.task1920;

import com.javarush.task.task15.task1521.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            TreeMap<String, Double> treeMap = new TreeMap<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                double value = Double.parseDouble(parts[1]);
                treeMap.merge(name, value, (a, b) -> a + b);
            }
            double max = Collections.max(treeMap.values());
            for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
                if (entry.getValue().equals(max)) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

    public static void main2(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(args[0]));
        Map<String, Double> result = strings.stream()
                .map(line -> line.split(" "))
                .collect(
                        TreeMap::new,
                        (map, arr) -> map.merge(arr[0], Double.parseDouble(arr[1]), Double::sum),
                        TreeMap::putAll
                );
        result.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Collections.max(result.values())))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
