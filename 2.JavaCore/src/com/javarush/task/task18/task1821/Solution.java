package com.javarush.task.task18.task1821;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> map = new TreeMap<>();
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]))) {
            int b;
            while ((b = inputStream.read()) != -1) {
                char character = (char) b;
//                map.put(c, map.getOrDefault(c, 0) + 1);
                map.merge(character, 1, Integer::sum);
            }
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        Files.readString(Path.of(args[0])).chars().boxed()
                .collect(Collectors.toMap(aChar -> (char) (aChar.intValue()), aChar -> 1, Integer::sum, TreeMap::new))
                .forEach((key, value) -> System.out.println(key + " " + value));
    }
}