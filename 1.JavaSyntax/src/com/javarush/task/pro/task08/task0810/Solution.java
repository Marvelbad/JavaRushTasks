package com.javarush.task.pro.task08.task0810;

import java.util.concurrent.TimeUnit;

/* 
Таймер
*/

public class Solution {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(2);
        TimeUnit.HOURS.sleep(2);
        TimeUnit.MINUTES.sleep(2);
        TimeUnit.SECONDS.sleep(2);
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
