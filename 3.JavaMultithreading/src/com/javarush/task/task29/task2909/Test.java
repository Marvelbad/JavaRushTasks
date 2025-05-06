package com.javarush.task.task29.task2909;

import com.javarush.task.task29.task2909.human.Human;
import com.javarush.task.task29.task2909.human.Soldier;
import com.javarush.task.task29.task2909.human.Student;

public class Test {
    public static void main(String[] args) {
        new Human("Men", 22);
        new Soldier("Sol", 25);
        new Student("Ken", 48, 2.5);

        System.out.println("OK");
    }
}