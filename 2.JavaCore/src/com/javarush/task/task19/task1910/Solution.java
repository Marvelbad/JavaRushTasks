package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();
        String fileName2 = console.readLine();
        console.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String clearLine = line.replaceAll("[^a-zA-Z0-9 ]", "");
                writer.write(clearLine);
            }
        }
    }
}
