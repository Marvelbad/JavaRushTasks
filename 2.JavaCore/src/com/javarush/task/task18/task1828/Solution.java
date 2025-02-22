package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) return;

        Map<Integer, String> map = new LinkedHashMap<>();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String fileData;
            while ((fileData = reader.readLine()) != null) {
                String currentId = fileData.substring(0, 8).trim();
                int id = Integer.parseInt(currentId);

                String productName = fileData.substring(8, 38).trim();
                String price = fileData.substring(38, 46).trim();
                String quantity = fileData.substring(46).trim();

                if (args[0].equals("-u") && currentId.equals(args[1])) {
                    String updateLine = String.format("%-30s%-8s%-4s",
                            args[2],
                            args[3],
                            args[4]);
                    map.put(id, updateLine);
                } else if (args[0].equals("-d") && currentId.equals(args[1])) {
                } else {
                    map.put(id, String.format("%-30s%-8s%-4s", productName, price, quantity));
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<Integer, String> entry :map.entrySet()) {
                writer.write(String.format("%-8s%s\n", entry.getKey().toString(), entry.getValue()));
            }
        }
    }
}
