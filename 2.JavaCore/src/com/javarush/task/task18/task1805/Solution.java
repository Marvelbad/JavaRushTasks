package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            try (FileInputStream inputStream = new FileInputStream(fileName)) {

                int data;
                Set<Integer> byteSet = new TreeSet<>();
                while ((data = inputStream.read()) != -1) {
                    byteSet.add(data);
                }
                for (int b : byteSet) {
                    System.out.print(b + " ");
                }
            }
        }
    }
}
