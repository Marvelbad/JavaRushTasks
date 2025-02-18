package com.javarush.task.task18.task1827;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0 || !args[0].equals("-c")) return;

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

            int maxId = Integer.MIN_VALUE;
            while (reader.ready()) {
                String fileData = reader.readLine();
                String curId = fileData.substring(0, 8).trim();
                int parsedId = Integer.parseInt(curId);
                if (parsedId > maxId) {
                    maxId = parsedId;
                }
            }
            maxId++;

            // Формирование новой строки
            int newId = maxId;
            String productName = args[1];
            String price = args[2];
            String quantity = args[3];

            // Formatting
            String formattedId = String.format("%-8d", newId);
            String formattedProductName = String.format("%-30s", productName.length() > 30 ? productName.substring(0, 30) : productName);
            String formattedPrice = String.format("%-8s", price);
            String formattedQuantity = String.format("%-4s", quantity);

            String newLine = formattedId + formattedProductName + formattedPrice + formattedQuantity;

            writer.newLine();
            writer.write(newLine);
        }
    }
}
