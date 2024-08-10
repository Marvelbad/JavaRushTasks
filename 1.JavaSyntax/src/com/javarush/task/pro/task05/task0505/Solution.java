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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrayNum = new int[N];
        for (int i = 0; i < N; i++) {
            arrayNum[i] = scanner.nextInt();
        }
        int min = arrayNum[0];
        for (int i = 0; i < N; i++) {
            if (arrayNum[i] < min) {
                min = arrayNum[i];
            }
            System.out.println(min);
        }
    }
}
