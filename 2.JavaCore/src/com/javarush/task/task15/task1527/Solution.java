package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String string = url.substring(url.lastIndexOf("?") + 1);
        String[] arguments = string.split("&");

        String objValue = null;

        for (String argument : arguments) {
            if (argument.contains("=")) {
                String[] elements = argument.split("=");

                if (elements[0].equals("obj")) {
                    objValue = elements[1];
                }
                System.out.print(elements[0] + " ");
            } else {
                System.out.print(argument + " ");
            }
        }

        System.out.println();

        if (objValue != null) {
            try {
                double doubleValue = Double.parseDouble(objValue);
                alert(doubleValue);
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}