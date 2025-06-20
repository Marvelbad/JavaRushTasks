package com.javarush.task.jdk13.task35.task3509;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Wildcards для коллекций
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
//        Double result = 0.0;
//        for (int i = 0; i < list.size(); i++) {
//            Number numb = list.get(i);
//            result += numb.doubleValue();
//        }
//        return result;

        return list.stream()
                .map(Number::doubleValue)
                .reduce(0.0, Double::sum);

    }

    public static Double multiply(List<? extends Number> list) {
//        Double result = 1.0;
//        for (int i = 0; i < list.size(); i++) {
//            Number numb = list.get(i);
//            result *= numb.doubleValue();
//        }
        return list.stream()
                .map(Number::doubleValue)
                .reduce(1.0, (a, b) -> a * b);
    }

    public static String concat(List<?> list) {
//        StringBuilder builder = new StringBuilder();
//        for (Object obj : list) {
//            builder.append(obj);
//        }
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static <T> List<T> combine(List<? extends Collection<T>> list) {
//        List<T> result = new ArrayList<>();
//        for (Collection<T> collection : list) {
//            result.addAll(collection);
//        }
        return list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}

