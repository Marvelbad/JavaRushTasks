package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            fileScanner = scanner;
        }


        @Override
        public Person read() throws IOException, ParseException {

                String line = fileScanner.nextLine();
                String[] strArray = line.split(" ");

                String dateStr = strArray[3] + " " + strArray[4] + " " + strArray[5];

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date birthDate = dateFormat.parse(dateStr);

                Person person = new Person (strArray[0], strArray[1], strArray[2], birthDate);
                return person;
        }

        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
