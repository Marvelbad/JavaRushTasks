package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            try (BufferedReader fileReader1 = new BufferedReader(new FileReader(file1))) {
                String line;
                while ((line = fileReader1.readLine()) != null) {
                    allLines.add(line);
                }
            }

            try (BufferedReader fileReader2 = new BufferedReader(new FileReader(file2))) {
                String line;
                while ((line = fileReader2.readLine()) != null) {
                    forRemoveLines.add(line);
                }
            }

        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
