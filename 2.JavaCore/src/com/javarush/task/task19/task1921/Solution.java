package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.time.LocalDate;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.replaceAll(" (\\d{1,2} \\d{1,2} \\d{4})$", "");
                String birth = line.replaceAll(".*?(\\d{1,2} \\d{1,2} \\d{4})$", "$1");

                String[] birthParts = birth.split(" ");
                int day = Integer.parseInt(birthParts[0]);
                int month = Integer.parseInt(birthParts[1]);
                int year = Integer.parseInt(birthParts[2]);

                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, year);
                cal.set(Calendar.MONTH, month - 1);
                cal.set(Calendar.DAY_OF_MONTH, day);
                Date date = cal.getTime();

                PEOPLE.add(new Person(name, date));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
