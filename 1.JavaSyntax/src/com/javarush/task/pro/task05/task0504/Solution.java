package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int a1 = firstArray.length; //length of first array
        int b1 = secondArray.length; //length of second array
        int c1 = a1 + b1; // both arrays length

        resultArray = new int[c1];

        System.arraycopy(firstArray, 0, resultArray, 0, a1);
        System.arraycopy(secondArray, 0, resultArray, a1, b1);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
