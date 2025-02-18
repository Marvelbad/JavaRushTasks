package com.javarush.task.task18.task1827;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in)); //Для считывания с консоли

        String fileName = console.readLine(); //Здесь считали адрес то что ввели в консоли
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)); //Тут открыли поток для чтения этого файла по этому адресу.
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { //А тут для записи новых данных по тому же адресу.
            while (reader.ready()) { //Здесь цикл чтобы, проверять, есть ли еще данные. То есть именно по строкам.
                String fileInside = reader.readLine();
                int id = Integer.parseInt(fileInside.substring(0, 8));
            }

        }
    }
}
