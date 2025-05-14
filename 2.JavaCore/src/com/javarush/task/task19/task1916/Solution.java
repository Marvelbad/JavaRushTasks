package com.javarush.task.task19.task1916;

import com.sun.jdi.request.StepRequest;

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

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))
        ) {
            String str1;
            while ((str1 = reader1.readLine()) != null) {
                list1.add(str1);
            }
            String str2;
            while ((str2 = reader2.readLine()) != null) {
                list2.add(str2);
            }
        }

        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list1.get(0).equals(list2.get(1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            } else if (list1.get(1).equals(list2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
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
