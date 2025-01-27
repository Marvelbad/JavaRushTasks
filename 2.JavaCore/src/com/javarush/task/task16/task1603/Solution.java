package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        List<SpecialThread> specialThreadList = Arrays.asList(
                new SpecialThread(),
                new SpecialThread(),
                new SpecialThread(),
                new SpecialThread(),
                new SpecialThread()
        );
        for (SpecialThread thread : specialThreadList) {
            Thread t = new Thread(thread);
            list.add(t);
        }
    }

    public static class SpecialThread implements Runnable {

        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
