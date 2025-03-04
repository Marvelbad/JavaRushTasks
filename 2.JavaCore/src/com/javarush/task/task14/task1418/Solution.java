package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/*
Исправь четыре ошибки
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>(); // Инициализация списка
        initList(list); // Заполнение списка
        printListValues(list); // Вывод значений списка
        processCastedObjects(list); // Обработка элементов списка
    }

    // Метод для заполнения списка
    private static void initList(List<Number> list) {
        list.add(1000.0); // Double
        list.add(123.0); // Double
        list.add(-90f / -3); // Float
        list.remove(1); // Удаляем элемент по индексу
    }

    // Метод для вывода значений списка
    private static void printListValues(List<Number> list) {
        for (Number num : list) { // Устранена ошибка цикла
            System.out.println(num); // Корректный вывод значений
        }
    }

    // Метод для обработки и анализа элементов списка
    private static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !a.isNaN());
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}