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

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();
        String fileName2 = console.readLine();
        console.close();

        List<String> originalLines = new ArrayList<>();
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {
            String line;
            while ((line = reader1.readLine()) != null) {
                originalLines.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                updatedLines.add(line);
            }

            while (!originalLines.isEmpty() && !updatedLines.isEmpty()) {
                if (originalLines.get(0).equals(updatedLines.get(0))) {
                    lines.add(new LineItem(Type.SAME, originalLines.get(0)));
                    originalLines.remove(0);
                    updatedLines.remove(0);
                } else if (updatedLines.size() > 1 && originalLines.get(0).equals(updatedLines.get(1))) {
                    lines.add(new LineItem(Type.ADDED, updatedLines.get(0)));
                    updatedLines.remove(0);
                } else if (originalLines.size() > 1 && originalLines.get(1).equals(updatedLines.get(0))) {
                    lines.add(new LineItem(Type.REMOVED, originalLines.get(0)));
                    originalLines.remove(0);
                }
            }

            while (!originalLines.isEmpty()) {
                lines.add(new LineItem(Type.REMOVED, originalLines.get(0)));
                originalLines.remove(0);
            }
            while (!updatedLines.isEmpty()) {
                lines.add(new LineItem(Type.ADDED, updatedLines.get(0)));
                updatedLines.remove(0);
            }
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
