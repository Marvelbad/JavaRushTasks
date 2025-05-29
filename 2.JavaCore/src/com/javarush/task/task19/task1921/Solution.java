package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.replaceAll("\\d", "").trim();
                String date = line.replaceAll("\\D", " ").trim();

                PEOPLE.add(new Person(name, dateFormat.parse(date)));
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        PEOPLE.forEach(System.out::println);

        Files.readAllLines(Paths.get(args[0])).stream()
                .map(string -> new Person(
                        string.replaceAll("\\d", "").trim(),
                        Date.from(
                                LocalDate.parse(string.replaceAll("\\D", " ").trim(), DateTimeFormatter.ofPattern("dd MM yyyy"))
                                        .atStartOfDay(ZoneId.systemDefault()).toInstant()
                        )
                ))
                .forEach(PEOPLE::add);
        PEOPLE.forEach(System.out::println);
    }
}
