package com.javarush.task.task18.task1820;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (BufferedReader input = new BufferedReader(new FileReader(fileName1));
             FileOutputStream output = new FileOutputStream(fileName2)
        ) {
            String line;
            while ((line = input.readLine()) != null) {
                String[] numberStrings = line.split("\\s+");
                for (String numStr : numberStrings) {
                    long num = Math.round(Double.parseDouble(numStr));
                    output.write((num + " ").getBytes());
                }
            }
        }
    }

    public static void main1(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();
        String fileName2 = console.readLine();

        try (BufferedReader input = new BufferedReader(new FileReader(fileName1));
             BufferedWriter output = new BufferedWriter(new FileWriter(fileName2))) {

            String result = input.lines()
                    .flatMap(line -> List.of(line.split("\\s+")).stream())
                    .map(Double::parseDouble)
                    .map(Math::round)
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            output.write(result);
        }
    }

    public static void main2(String[] args) throws IOException {
        Files.write(Paths.get(new Scanner(System.in).nextLine()),
                Files.readAllLines(Paths.get(new Scanner(System.in).nextLine())).stream()
                        .map(string -> string.split("\\s+"))
                        .flatMap(array -> Arrays.stream(array)
                                .map(Double::parseDouble)
                                .map(Math::round)
                                .map(number -> String.join(" ")))
                        .toList());
    }
}
