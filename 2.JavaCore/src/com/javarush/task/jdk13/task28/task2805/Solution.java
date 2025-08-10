package com.javarush.task.jdk13.task28.task2805;

/*
Многопоточный факториал
*/

import java.util.concurrent.FutureTask;

public class Solution {

    public static void main(String[] args) throws Exception {
        CalculateFactorial factorial = new CalculateFactorial(5L);
        System.out.println(factorial.call());

        FutureTask<Long> future1 = new FutureTask<>(new CalculateFactorial(3L));
        FutureTask<Long> future2 = new FutureTask<>(new CalculateFactorial(10L));
        FutureTask<Long> future3 = new FutureTask<>(new CalculateFactorial(35L));
        new Thread(future1).start();
        new Thread(future2).start();
        new Thread(future3).start();
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }
}