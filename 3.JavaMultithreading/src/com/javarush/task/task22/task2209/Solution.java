package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> words = readWordsFromFile();
        if (words.isEmpty()) {
            System.out.println("Файл пустой или не найден.");
            return;
        }
        StringBuilder result = getLine(words.toArray(new String[0]));
        System.out.println(result);
    }

    private static List<String> readWordsFromFile() {
        List<String> words = new ArrayList<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String filename = console.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        words.addAll(Arrays.asList(line.trim().split("\\s+")));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        return words;
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) return new StringBuilder();

        List<StringBuilder> builderList = new ArrayList<>();

        for (String word : words) {
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);

            StringBuilder builder = new StringBuilder(word);
            int count = 0;
            int maxTries = (words.length * words.length);

            while (!list.isEmpty() && count <= maxTries) {
                String firstStartChar = builder.substring(0, 1);
                String firstEndChar = builder.substring(builder.length() - 1);

                boolean wordAdded = false;

                for (int i = 0; i < list.size(); i++) {
                    String candidate = list.get(i);
                    String candidateStart = candidate.substring(0, 1);
                    String candidateEnd = candidate.substring(candidate.length() - 1);

                    if (firstEndChar.equalsIgnoreCase(candidateStart)) {
                        builder.append(" ").append(candidate);
                        list.remove(i);
                        wordAdded = true;
                        break;
                    } else if (firstStartChar.equalsIgnoreCase(candidateEnd)) {
                        builder.insert(0, candidate + " ");
                        list.remove(i);
                        wordAdded = true;
                        break;
                    }
                }

                if (!wordAdded) {
                    // если никто не подошёл — увеличиваем count и двигаем первый элемент в конец
                    String temp = list.remove(0);
                    list.add(temp);
                    count++;
                }
            }
            builderList.add(builder);
        }

        // возвращаем самую длинную цепочку, а не первую попавшуюся
        return builderList.stream()
                .max(Comparator.comparingInt(StringBuilder::length))
                .orElse(new StringBuilder());
    }
}