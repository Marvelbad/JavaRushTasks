package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String sourceFile = reader.readLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile))) {
                while (true) {
                    String str = reader.readLine();
                    writer.write(str);
                    writer.newLine();

                    if (str.equalsIgnoreCase("exit")) {
                        break;
                    }
                }
            }
        }
    }
}
