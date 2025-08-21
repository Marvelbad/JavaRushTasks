package com.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.IntStream;

/* 
Кеширование нитей
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        executorService = Executors.newCachedThreadPool();

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() {
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new Producer(String.valueOf(i)));
//        }
        IntStream.range(0, 100)
                .mapToObj(String::valueOf)
                .map(Producer::new)
                .forEach(executorService::submit);
    }

    public static void submitConsumers() {
        Consumer consumer = new Consumer();
        IntStream.range(0, 100)
                .forEach(i -> executorService.submit(consumer));
    }

}
