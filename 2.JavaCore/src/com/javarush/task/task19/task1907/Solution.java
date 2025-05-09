package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] words = line.replaceAll("\\p{P}", " ").split(" ");
        int counter = 0;
        for (String word : words) {
            if (word.equals("world")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main1(String[] args) throws IOException {
        System.out.println(
                Arrays.stream(
                                Files.readString(Paths.get(new Scanner(System.in).nextLine()))
                                        .replaceAll("\\p{P}", " ")
                                        .split(" ")
                        )
                        .filter(str -> str.equals("world"))
                        .count()
        );
    }
}
