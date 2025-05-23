package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};  //Массив

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }


    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int max = inputArray[0];
        int min = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
               max = inputArray[i];
            }
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }

        return new Pair(min, max);
    }


    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) { //Конструкток
            this.x = x;
            this.y = y;
        }
    }
}
