package com.javarush.task.jdk13.task28.task2814;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Сбор статистики
*/

public class Solution {

    public static ExecutorService cachedPool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception {
        Callable<String> task = () -> {
            Thread.sleep(100);

            return "Done";
        };

        printStatistic();
        invokeMillionTasks(task);
        printStatistic();
        shutdown();
    }

    public static void invokeMillionTasks(Callable<String> task) throws Exception {
//        List<Callable<String>> list = new ArrayList<>();
//        for (int i = 0; i < 1_000_000; i++) {
//            list.add(task);
//        }
//        List<Callable<String>> list1 = IntStream.range(1, 1_000_000)
//                .mapToObj(i -> task)
//                .toList();
//
//        cachedPool.invokeAll(list1);

        cachedPool.invokeAll(Collections.nCopies(1_000_000, task));

    }

    public static void printStatistic() {
        ThreadPoolExecutor pool = (ThreadPoolExecutor) cachedPool;

        System.out.println("-------------------------------------------");
        System.out.println("Наибольшее число нитей одновременно находящихся в пуле: "
                + pool.getLargestPoolSize());
        System.out.println("Максимально возможное количество нитей в пуле: "
                + pool.getMaximumPoolSize());
        System.out.println("Текущее количество нитей в пуле: "
                + pool.getPoolSize());
        System.out.println("Количество запланированных задач: "
                + pool.getTaskCount());
    }

    public static void shutdown() throws Exception {
        cachedPool.shutdown();
        boolean isTerminated = cachedPool.awaitTermination(100, TimeUnit.MILLISECONDS);
        if (!isTerminated) {
            cachedPool.shutdownNow();
        }
    }
}
