package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите полный путь архива:");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String string = console.readLine();
        Path path = Paths.get(string);

        ZipFileManager zipFileManager = new ZipFileManager(path);
        System.out.println("Теперь введите путь к файлу, который будем архивировать:)");
        String fileToZipString = console.readLine();
        Path fileToZip = Paths.get(fileToZipString);
        zipFileManager.createZip(fileToZip);
    }
}
