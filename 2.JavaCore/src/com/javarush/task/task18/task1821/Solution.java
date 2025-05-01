package com.javarush.task.task18.task1821;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> map = new TreeMap<>();
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]))) {
            int b;
            while ((b = inputStream.read()) != -1) {
                char c = (char) b;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}

