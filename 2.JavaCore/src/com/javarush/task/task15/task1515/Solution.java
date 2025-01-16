package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    static {
        BufferedReader reader = null;
        try {
          reader = new BufferedReader(new InputStreamReader(System.in));
          Solution.A = Integer.parseInt(reader.readLine());
          Solution.B = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
        }
    }


    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
