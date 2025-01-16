package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String key = reader.readLine();

            if (key.equalsIgnoreCase("helicopter")) {
                result = new Helicopter();
            } else if (key.equalsIgnoreCase("plane")) {
                result = new Plane(Integer.parseInt(key));
            } reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
