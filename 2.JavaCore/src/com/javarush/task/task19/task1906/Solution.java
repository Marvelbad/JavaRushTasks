package com.javarush.task.task19.task1906;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (BufferedReader input = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        ) {
            int counter = 0;
            char currentChar;
            int readValue;
            while ((readValue = input.read()) != -1) {
                currentChar = (char) readValue;
                counter++;

                if (counter % 2 != 0) {
                    writer.write(currentChar);
                }
            }
        }
    }

    public static void main1(String[] args) throws IOException {
        String string = Files.readString(Path.of(new Scanner(System.in).nextLine()));
        String collect = IntStream.range(0, string.length())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> String.valueOf(string.charAt(index)))
                .collect(Collectors.joining());
        Files.writeString(Path.of(new Scanner(System.in).nextLine()), collect);
    }
}
