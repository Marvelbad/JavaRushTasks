package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            try (FileInputStream input = new FileInputStream(fileName)) {
                Map<Integer, Integer> map = new HashMap<>();
                while (input.available() > 0) {
                    int data = input.read();
                    map.merge(data, 1, (oldVal, newVal) -> oldVal + newVal);
                }

                int max = Collections.max(map.values());

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == max) {
                        System.out.print(entry.getKey() + " ");
                    }
                }
            }
        }
    }
}
