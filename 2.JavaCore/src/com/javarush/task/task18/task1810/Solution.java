package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String filename = reader.readLine();
                try (FileInputStream fis = new FileInputStream(filename)) {
                    if (fis.available() < 1000) {
                        throw new DownloadException();
                    }
                }
            }
        }
    }

    public static class DownloadException extends Exception {
    }
}