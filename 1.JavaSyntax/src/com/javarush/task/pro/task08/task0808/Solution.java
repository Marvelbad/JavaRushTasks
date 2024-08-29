package com.javarush.task.pro.task08.task0808;

/* 
Обратный отсчет
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        countDown();
    }
    public static void countDown() throws InterruptedException {
        try {
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("Старт!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
