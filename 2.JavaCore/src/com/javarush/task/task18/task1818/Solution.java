package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        try (FileOutputStream outputStream = new FileOutputStream(file1, true);
             FileInputStream inputStream1 = new FileInputStream(file2);
             FileInputStream inputStream2 = new FileInputStream(file3)) {

            int countByte;
            byte[] buffer = new byte[8192];
            while ((countByte = inputStream1.read(buffer)) != -1) {
                outputStream.write(buffer, 0, countByte);
            }

            while ((countByte = inputStream2.read(buffer)) != -1) {
                outputStream.write(buffer, 0, countByte);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
