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
    public static final List<Person> allPeople = new ArrayList<Person>();

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
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        try {
                            int id = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            String sex = args[i + 2];
                            Date bd = input.parse(args[i + 3]);

                            if (id >= 0 && id < allPeople.size()) {
                                person = allPeople.get(id);
                                person.setName(name);
                                person.setSex("м".equalsIgnoreCase(sex) ? Sex.MALE : Sex.FEMALE);
                                person.setBirthDate(bd);
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        try {
                            int id = Integer.parseInt(args[i]);

                            if (id >= 0 && id < allPeople.size()) {
                                person = allPeople.get(id);
                                person.setName(null);
                                person.setSex(null);
                                person.setBirthDate(null);
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        try {
                            int id = Integer.parseInt(args[i]);

                            if (id >= 0 && id < allPeople.size()) {
                                person = allPeople.get(id);
                                if (person.getName() == null) {
                                    System.out.println("Note deleted");
                                } else {
                                    String sex = (person.getSex() == Sex.MALE) ? "м" : "ж";
                                    System.out.println(person.getName() + " " + sex + " " + output.format(person.getBirthDate()));
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                break;
        }
    }
}
