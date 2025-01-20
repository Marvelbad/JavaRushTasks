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

        String string = url.substring(url.lastIndexOf("?") +1);
        String[] arguments = string.split("&");

        for (String argument : arguments) {
            if (argument.contains("=")) {
                int index = argument.indexOf("=");
                String argumentName = argument.substring(0, index);
                System.out.print(argumentName + " ");
            } else {
                System.out.print(argument + " ");
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
