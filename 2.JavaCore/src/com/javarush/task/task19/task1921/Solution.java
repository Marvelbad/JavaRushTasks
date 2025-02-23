package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
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

                String date = line.replaceAll("\\D", "").replaceFirst("(\\d{2})(\\d{2})(\\d+)", "$1 $2 $3");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date date1 = dateFormat.parse(date);

                PEOPLE.add(new Person(name, date1));

                PEOPLE.forEach(person -> System.out.println(person.getName() + " - " + person.getBirthDate()));

//                System.out.println(name + " " + dateFormat.format(date1));
            }
        }
    }
}
