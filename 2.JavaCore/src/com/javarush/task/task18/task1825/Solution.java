package com.javarush.task.task18.task1825;


import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /// ///////treeMap !!!!!!!!!!!!!

        TreeSet<String> fileParts = new TreeSet<String>();

        while (true) {
            try {
                String input = reader.readLine();
                if (input.equalsIgnoreCase("end")) {
//                    System.out.println(fileParts);
                    break;
                }
                fileParts.add(input);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


        String str = fileParts.first();
        int index = str.lastIndexOf(".part");
        if (index == -1) {
            System.out.println("Warning: Skipping invalid file - " + str);
            System.exit(1);
        }
        String result = str.substring(0, index);

//        System.out.println(result);

        try (FileOutputStream outputStream = new FileOutputStream(result)) {
            for (String part : fileParts) {
                byte[] buffer = new byte[1024];
                try (FileInputStream inputStream = new FileInputStream(part)) {
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}

