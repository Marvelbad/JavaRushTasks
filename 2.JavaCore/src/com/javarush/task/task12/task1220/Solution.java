package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }


    public abstract class Human implements CanRun, CanSwim {

    }

    public class Swimmer extends Human {
        @Override
        public void run() {
            System.out.println("Run");
        }

        @Override
        public void swim() {
            System.out.println("Swimming");
        }
    }

}
