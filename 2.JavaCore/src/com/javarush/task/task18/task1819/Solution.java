package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();
        String fileName2 = console.readLine();

        try (FileInputStream input1 = new FileInputStream(fileName1);
             FileInputStream input2 = new FileInputStream(fileName2);
        ) {
            ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
            while (input2.available() > 0) {
                arrayOutputStream.write(input2.read());
            }
            while (input1.available() > 0) {
                arrayOutputStream.write(input1.read());
            }

            try (FileOutputStream output = new FileOutputStream(fileName1)
            ) {
                arrayOutputStream.writeTo(output);
            }
        }
    }
}
