package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {

        try {
            File yourFile = File.createTempFile("your_file_name", null);
            try (OutputStream outputStream = new FileOutputStream(yourFile);
                 InputStream inputStream = new FileInputStream(yourFile)) {

                JavaRush javaRush = new JavaRush();
                User user = new User();
                user.setFirstName("Alex");
                user.setLastName("Ivanov");
                user.setBirthDate(new Date(1987, Calendar.FEBRUARY, 06));
                user.setMale(true);
                user.setCountry(User.Country.RUSSIA);

                javaRush.users.add(user);

                javaRush.save(outputStream);
                outputStream.flush();

                JavaRush loadedObject = new JavaRush();
                loadedObject.load(inputStream);

                System.out.println(loadedObject.equals(javaRush));
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter writer = new PrintWriter(outputStream)) {
                if (!users.isEmpty()) {
                    for (User user : users) {
                        String nameStr = user.getFirstName();
                        String lastStr = user.getLastName();
                        long birthDay = user.getBirthDate().getTime();
                        boolean maleStatus = user.isMale();
                        String userCountry = user.getCountry().getDisplayName();
                        writer.println(nameStr + " " + lastStr + " " + birthDay + " " + maleStatus + " " + userCountry);
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))
            ) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(" ");
                    if (parts.length < 5) break;
                    String name = parts[0];
                    String lastName = parts[1];
                    Date birthDay = new Date(Long.parseLong(parts[2]));
                    boolean maleStatus = Boolean.parseBoolean(parts[3]);
                    User.Country country = User.Country.valueOf(parts[4].toUpperCase());

                    User user = new User();
                    user.setFirstName(name);
                    user.setLastName(lastName);
                    user.setBirthDate(birthDay);
                    user.setMale(maleStatus);
                    user.setCountry(country);

                    users.add(user);
                }
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
