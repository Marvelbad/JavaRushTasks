package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        while (!(fileName = reader.readLine()).equals("exit")) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            try (FileInputStream input = new FileInputStream(fileName)) {
                while (input.available() > 0) {
                    int readByte = input.read();
                    if (!map.containsKey(readByte)) {
                        map.put(readByte, 1);
                    } else {
                        Integer value = map.get(readByte);
                        map.put(readByte, value + 1);
                    }
                }

            } catch (IOException e) {
            }
            Integer max = Collections.max(map.values());
            Integer byteKey = map.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(max))
                    .map(entry -> entry.getKey())
                    .sorted()
                    .collect(Collectors.toList()).get(0);
            resultMap.put(fileName, byteKey);
        }
    }
}
