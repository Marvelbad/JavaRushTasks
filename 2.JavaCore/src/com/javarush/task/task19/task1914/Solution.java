package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String text = outputStream.toString();
        String[] resultArray = text.split(" ");
        int firstNum = Integer.parseInt(resultArray[0]);
        int secondNum = Integer.parseInt(resultArray[2]);
        int arithmeticResult;
        if (resultArray[1].trim().equals("+")) {
            arithmeticResult = firstNum + secondNum;
        } else if (resultArray[1].trim().equals("-")) {
            arithmeticResult = firstNum - secondNum;
        } else {
            arithmeticResult = firstNum * secondNum;
        }
        System.setOut(originalOut);
        System.out.println(firstNum + " " + resultArray[1] + " " + secondNum + " = " + arithmeticResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

