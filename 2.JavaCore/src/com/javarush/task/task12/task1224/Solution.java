package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<Class, String> animals = new HashMap<>();

        animals.put(Cat.class, "Кот");
        animals.put(Tiger.class, "Тигр");
        animals.put(Lion.class, "Лев");
        animals.put(Bull.class, "Бык");
        animals.put(Pig.class, "Свинья");

        System.out.println(getObjectType(new Cat(), animals));
        System.out.println(getObjectType(new Tiger(), animals));
        System.out.println(getObjectType(new Lion(), animals));
        System.out.println(getObjectType(new Bull(), animals));
        System.out.println(getObjectType(new Pig(), animals));
    }


    public static String getObjectType(Object o, Map<Class, String> animals) {
        return animals.getOrDefault(o.getClass(), "Животное");
    }

    public static class Cat {

    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
