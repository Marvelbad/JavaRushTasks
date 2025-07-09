package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String str = console.readLine();
        String[] strings = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(str))) {
            String line;
            if ((line = reader.readLine()) != null) {
                strings = line.split(" ");
            }
        }

        StringBuilder result = getLine(strings);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) return new StringBuilder();

        List<StringBuilder> builderList = new ArrayList<>();

        for (String word : words) {
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);

            StringBuilder builder = new StringBuilder(word);
            int count = 0;
            while (!list.isEmpty()) {
                String firstStartChar = builder.substring(0, 1);
                String firstEndChar = builder.substring(builder.length() - 1);
                String str = list.get(0);
                String secondStartChar = str.substring(0, 1);
                String secondEndChar = str.substring(str.length() - 1);

                if (firstEndChar.equalsIgnoreCase(secondStartChar)) {
                    builder.append(" ").append(str);
                    list.remove(0);
                } else if (firstStartChar.equalsIgnoreCase(secondEndChar)) {
                    builder.insert(0, str + " ");
                    list.remove(0);
                } else {
                    list.remove(str);
                    list.add(str);
                    count++;
                    if (count > Math.pow(words.length, 2)) break;
                }
            }
            builderList.add(builder);
        }
        builderList.forEach(System.out::println);
        return builderList.stream()
                .max(Comparator.comparingInt(StringBuilder::length)).get();
    }
}