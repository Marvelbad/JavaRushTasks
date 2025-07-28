package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {
        List<Long> result = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            int digitLength = String.valueOf(i).length();
            String numStr = String.valueOf(i);
            long sum = 0;
            for (int j = 0; j < digitLength; j++) {
                char ch = numStr.charAt(j);
                int digit = Character.getNumericValue(ch);
                sum += (long) Math.pow(digit, digitLength);
            }
            if (sum == i) {
                result.add((long) i);
            }
        }
        return result.stream().mapToLong(Long::longValue).toArray();
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
