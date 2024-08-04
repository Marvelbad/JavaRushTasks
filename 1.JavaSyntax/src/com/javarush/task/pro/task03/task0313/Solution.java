package com.javarush.task.pro.task03.task0313;

public class Solution {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HELL";

        boolean trueOrFalse = str1.equalsIgnoreCase(str2);
        System.out.println(trueOrFalse);
    }
}
