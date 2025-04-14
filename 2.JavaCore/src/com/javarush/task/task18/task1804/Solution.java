package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                Map<Integer, Integer> map = new HashMap<>();

                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    map.merge(data, 1, Integer::sum);
                }

                int min = Collections.min(map.values());

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == min) {
                        System.out.print(entry.getKey() + " ");
                    }
                }
            }
        }

    }
}
