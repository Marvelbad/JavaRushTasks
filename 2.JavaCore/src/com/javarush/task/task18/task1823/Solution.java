package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = console.readLine()).equalsIgnoreCase("exit")) {
            ReadThread readThread = new ReadThread(line);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void run() {
            Map<Integer, Integer> byteFrequency = new HashMap<>();
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                int data;
                int maxCount = 0;
                int minByte = Integer.MAX_VALUE;
                while ((data = inputStream.read()) != -1) {
                    byteFrequency.merge(data, 1, Integer::sum);
                    for (Map.Entry<Integer, Integer> entry : byteFrequency.entrySet()) {
                        int currentByte = entry.getKey();
                        int count = entry.getValue();

                        if (count > maxCount) {
                            maxCount = count;
                            minByte = currentByte;
                        } else if (count == maxCount && currentByte < minByte) {
                            minByte = currentByte;
                        }
                        resultMap.put(fileName, minByte);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
