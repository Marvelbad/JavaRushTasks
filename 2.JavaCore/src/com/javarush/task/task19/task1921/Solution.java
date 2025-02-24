package com.javarush.task.task19.task1921;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        String path = "/Users/badribagateliya/IdeaProjects/Learning Project/MyNewModule/PracticeModule/src/NewPractice/textFile";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.replaceAll("\\d", "").trim();

                String date = line.replaceAll("\\D", " ").trim();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date date1 = dateFormat.parse(date);

                PEOPLE.add(new Person(name, date1));
            }
            PEOPLE.forEach(person -> System.out.println(person.getName() + " - " + person.getBirthDate()));
        }

        List<String> list = Files.readAllLines(Paths.get(path));
        list.stream()
                .map(str -> new Person(
                        str.replaceAll("\\d", "").trim(),
                        Date.from(
                                LocalDate.parse(str.replaceAll("\\D", " ").trim(), DateTimeFormatter.ofPattern("dd MM yyyy"))
                                        .atStartOfDay(ZoneId.systemDefault()).toInstant()
                        )

                ))
                .peek(PEOPLE::add)
                .forEach(person -> System.out.println(person.getName() + " " + person.getBirthDate()));
    }
}
