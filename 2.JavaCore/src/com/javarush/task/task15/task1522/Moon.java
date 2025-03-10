package com.javarush.task.task15.task1522;

public class Moon implements Planet {
    private static volatile Moon instance;

    private Moon(){
    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
