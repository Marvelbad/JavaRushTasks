package com.javarush.task.task16.task1614;

import java.util.ArrayList;
import java.util.List;

/* 
Обратный отсчет
*/

public class Solution {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);  // Уже есть обьекты: Строка 1, Строка 2 ...
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();  // Старт потока!
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            System.out.println(list.get(countFrom -1));
            Thread.sleep(500);
            countFrom--;
        }
    }
}
