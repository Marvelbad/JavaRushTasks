package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите полный путь архива: ");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String zipFilePathInput = consoleReader.readLine();
        Path path = Paths.get(zipFilePathInput);

        ZipFileManager zipFileManager = new ZipFileManager(path);

        System.out.println("Введите путь к файлу, который будем архивировать: ");
        String sourceFilePathInput = consoleReader.readLine();
        Path sourceFilePath = Paths.get(sourceFilePathInput);

        zipFileManager.createZip(sourceFilePath);
    }
}
