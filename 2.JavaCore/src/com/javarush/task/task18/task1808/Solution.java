package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Arrays;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = console.readLine();
        String fileTwo = console.readLine();
        String fileThree = console.readLine();

        try (FileInputStream inputStream = new FileInputStream(fileOne);
             FileOutputStream outputStream1 = new FileOutputStream(fileTwo);
             FileOutputStream outputStream2 = new FileOutputStream(fileThree)
        ) {
            byte[] allBytes = inputStream.readAllBytes();
            if (allBytes.length % 2 == 0) {
                byte[] firstHalfArray = Arrays.copyOfRange(allBytes, 0, allBytes.length / 2);
                byte[] secondHalfArray = Arrays.copyOfRange(allBytes, allBytes.length / 2, allBytes.length);
                outputStream1.write(firstHalfArray);
                outputStream2.write(secondHalfArray);
            } else if (allBytes.length % 2 != 0) {
                byte[] firstHalfArray = Arrays.copyOfRange(allBytes, 0, (allBytes.length / 2 + 1));
                byte[] secondHalfArray = Arrays.copyOfRange(allBytes, (allBytes.length / 2) + 1, allBytes.length);
                outputStream1.write(firstHalfArray);
                outputStream2.write(secondHalfArray);
            }
        }
    }
}
