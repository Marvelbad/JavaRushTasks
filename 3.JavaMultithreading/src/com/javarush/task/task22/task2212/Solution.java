package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;

        int digits = telNumber.replaceAll("\\D", "").length();

        // Проверка начала номера и количества цифр
        if (telNumber.startsWith("+") && digits != 12) return false;
        // если номер начинается с цифры...
        if ((Character.isDigit(telNumber.charAt(0)) || telNumber.charAt(0) == '(') &&
                digits != 10) return false;

        // Только цифры, плюс, скобки
        if (!telNumber.matches("^[\\d+()]+$")) return false;

        // Проверка скобок
        if (telNumber.contains("(") || telNumber.contains(")")) {
            // Одна пара скобок, три цифры внутри, нет лишних скобок
            if (!telNumber.matches(".*\\(\\d{3}\\).*")) return false;
            if (telNumber.replaceAll("[^()]", "").length() != 2) return false;
            // Скобки только до дефиса или конца номера, не вложены
            if (telNumber.indexOf('(') > telNumber.indexOf(')')) return false;
        }

        // Последний символ — цифра
        if (!Character.isDigit(telNumber.charAt(telNumber.length() - 1))) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println("+380501234567 - true = " + checkTelNumber("+380501234567"));
        System.out.println("+3805012345673 - false = " + checkTelNumber("+3805012345673"));
        System.out.println("+38050123456 - false = " + checkTelNumber("+38050123456"));
        System.out.println("+38(050)1234567 - true = " + checkTelNumber("+38(050)1234567"));
        System.out.println("(050)1234567 - true = " + checkTelNumber("(050)1234567"));
        System.out.println("0(501)234567 - true = " + checkTelNumber("0(501)234567"));
        System.out.println("+38)050(1234567 - false = " + checkTelNumber("+38)050(1234567"));
        System.out.println("+38(050)123-45-67 - false = " + checkTelNumber("+38(050)123-45-67"));
        System.out.println("050ххх4567 - false = " + checkTelNumber("050ххх4567"));
        System.out.println("050123456 - false = " + checkTelNumber("050123456"));
        System.out.println("(0)501234567 - false = " + checkTelNumber("(0)501234567"));
        System.out.println("123456789012 - false = " + checkTelNumber("123456789012"));
        System.out.println("123(456)7890 - true = " + checkTelNumber("123(456)7890"));
        System.out.println("123456(789)0 - true = " + checkTelNumber("123456(789)0"));
        System.out.println("+123(456)789012 - true = " + checkTelNumber("+123(456)789012"));
        System.out.println("+123456(789)012 - true = " + checkTelNumber("+123456(789)012"));
        System.out.println("+123456789(456) - false = " + checkTelNumber("+123456789(456)"));
        System.out.println("Проверка на пустую строку \"\" - false = " + checkTelNumber(""));
        System.out.println("Проверка на null - false =  " + checkTelNumber(null));
    }
}
