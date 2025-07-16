package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));

        try {
            File file = new File("Solution.dat");

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

            Solution savedObject = new Solution(4);

            out.writeObject(savedObject);
            out.close();

            Solution another = new Solution(100);

            Solution loadedObject = (Solution) in.readObject();
            in.close();

            System.out.println(savedObject.string);
            System.out.println(loadedObject.string);
            System.out.println(savedObject.string.equals(loadedObject.string));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
