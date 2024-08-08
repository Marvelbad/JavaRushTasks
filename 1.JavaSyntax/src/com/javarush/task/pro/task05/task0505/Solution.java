package com.javarush.task.pro.task05.task0505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
            }
            if (N % 2 == 1) {
                for (int i = 0; i < N; i++) {
                    System.out.println(numbers[i]);
                }
            } else {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
