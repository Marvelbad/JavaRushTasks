package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        console.close();

        PrintStream realStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        System.setOut(myStream);

        testString.printSomething();

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)
        ) {
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            System.setOut(realStream);
            System.out.println(byteArrayOutputStream.toString());
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

