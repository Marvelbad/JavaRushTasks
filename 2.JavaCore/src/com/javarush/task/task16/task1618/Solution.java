package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread1 = new TestThread();
        thread1.start();
        thread1.interrupt();
    }


    public static class TestThread extends Thread {
        @Override
        public void run() {
            super.run();
        }
    }
}