package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        Person person = null;

        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        try {
                            String name = args[i];
                            String sex = args[i + 1];
                            Date bd = input.parse(args[i + 2]);

                            if ("м".equalsIgnoreCase(sex)) {
                                allPeople.add(Person.createMale(name, bd));
                            } else if ("ж".equalsIgnoreCase(sex)) {
                                allPeople.add(Person.createFemale(name, bd));
                            }

                            System.out.println(allPeople.size() - 1);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
        }
    }
}
