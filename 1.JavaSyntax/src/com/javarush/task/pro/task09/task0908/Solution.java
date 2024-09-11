package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }
        /*Checking the correctness of symbols*/
        if (!binaryNumber.matches("[01]+")) {
            return "";
        }

        /*Checking the length of a string*/
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        /*Main method*/
        StringBuilder hexResult = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String fourBits = binaryNumber.substring(i, i + 4);
            String hexDigit = convertFourBitsToHex(fourBits);
            hexResult.append(hexDigit);
        }

        return hexResult.toString();
    }
    /*Transformation method*/
    public static String convertFourBitsToHex(String fourBits) {
        switch (fourBits) {
            case "0000": return "0";
            case "0001": return "1";
            case "0010": return "2";
            case "0011": return "3";
            case "0100": return "4";
            case "0101": return "5";
            case "0110": return "6";
            case "0111": return "7";
            case "1000": return "8";
            case "1001": return "9";
            case "1010": return "A";
            case "1011": return "B";
            case "1100": return "C";
            case "1101": return "D";
            case "1110": return "E";
            case "1111": return "F";
            default: return "";
        }
    }


    /*START binary*/
    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            char charAt = hexNumber.charAt(i);
            if ((!(charAt >= '0' && charAt <= '9') && !(charAt >= 'a' && charAt <= 'f'))) {
                return "";
            }
        }

        StringBuilder binaryResult = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            char hexChar = hexNumber.charAt(i);
            String binarySegment = convertHexToFourBits(hexChar);
            binaryResult.append(binarySegment);
        }
        return binaryResult.toString();
    }

    public static String convertHexToFourBits(char hexChar) {
        switch (hexChar) {
            case '0': return "0000";
            case '1': return "0001";
            case '2': return "0010";
            case '3': return "0011";
            case '4': return "0100";
            case '5': return "0101";
            case '6': return "0110";
            case '7': return "0111";
            case '8': return "1000";
            case '9': return "1001";
            case 'a': return "1010";
            case 'b': return "1011";
            case 'c': return "1100";
            case 'd': return "1101";
            case 'e': return "1110";
            case 'f': return "1111";
            default: return "";
        }
    }
}