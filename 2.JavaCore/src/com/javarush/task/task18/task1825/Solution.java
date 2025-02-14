package com.javarush.task.task18.task1825;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, String> files = new TreeMap<>();

        while (true) {
            String input = reader.readLine();
            if (input.equalsIgnoreCase("end")) break;

            String number = input.substring(input.lastIndexOf("t") + 1);
            int index = Integer.parseInt(number);

            if (!files.containsKey(index)) {
                files.put(index, input);
            }
        }

        for (String str : files.values()) {
            String fileName = str.substring(0, str.lastIndexOf("."));
            try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(str));
                 BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
                while (input.available() > 0) {
                    output.write(input.read());
                }
            }
        }

        for (String value : files.values()) {
            Files.write(
                    Path.of(value.substring(0, value.lastIndexOf("."))),
                    Files.readAllBytes(Path.of(value)),
                    StandardOpenOption.APPEND
            );

        }

//        files.values()
//                .forEach(value -> {
//                    try {
//                        Files.write(Path.of(value.substring(0, value.lastIndexOf("."))), Files.readAllBytes(Path.of(value)), StandardOpenOption.APPEND);
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
    }
}

