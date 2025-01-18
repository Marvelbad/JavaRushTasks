package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;
        while (!(key = reader.readLine()).equalsIgnoreCase("exit")) {
            if (key.matches("\\D+")) {
                print(key);
            } else {
                try {
                    if (key.contains(".")) {
                        print(Double.parseDouble(key));
                    } else {
                        int num = Integer.parseInt(key);
                        if (num > 0 && num < 128) {
                            print((short) num);
                        } else {
                            print(num);
                        }
                    }
                } catch (NumberFormatException e) {
                    print(key);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
