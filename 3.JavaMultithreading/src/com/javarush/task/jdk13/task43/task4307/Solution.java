package com.javarush.task.jdk13.task43.task4307;

//import org.apache.commons.lang3.ObjectUtils;

/* 
Шило на мыло
*/

import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
        if (Objects.isNull(values)) {
            return;
        }
        for (String value : values) {
            if (Objects.nonNull(value)) {
                System.out.println(value);
                return;
            }
        }
    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
        for (String o : values) {
            System.out.println(Objects.requireNonNullElse(o, defaultValue));
        }
    }
}
