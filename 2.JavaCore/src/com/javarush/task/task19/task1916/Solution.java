package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1Lines = console.readLine();
        String file2Lines = console.readLine();
        console.close();

        List<String> originalLines = new ArrayList<>();
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Lines));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Lines))

        ) {
            String originalLine;
            while ((originalLine = reader1.readLine()) != null) {
                originalLines.add(originalLine);
            }

            String updatedLine;
            while ((updatedLine = reader2.readLine()) != null) {
                updatedLines.add(updatedLine);
            }

            int i = 0;
            int j = 0;

            while (i < originalLines.size() && j < updatedLines.size()) {
                if (originalLines.get(i).equals(updatedLines.get(j))) {
                    lines.add(new LineItem(Type.SAME, originalLines.get(i)));
                    i++;
                    j++;

                } else if ((j + 1) < updatedLines.size() && originalLines.get(i).equals(updatedLines.get(j + 1))) {
                    lines.add(new LineItem(Type.ADDED, updatedLines.get(j)));
                } else if ((i + 1) < originalLines.size() && originalLines.get(i + 1).equals(updatedLines.get(j))) {
                    lines.add(new LineItem(Type.REMOVED, originalLines.get(i)));
                    i++;
                }   //ПЕРЕПИСАТЬ УДАЛЕНИЕМ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            }

            while (i < originalLines.size()) {
                lines.add(new )
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
