package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private List<Human> children = new ArrayList<>();
    private Size size;
    private static int nextId = 0;
    protected int age;
    protected String name;


    public class Size {
        public int height;
        public int weight;
    }

    private BloodGroup bloodGroup;

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human) {
        if (human != null) {
            children.add(human);
        }
    }

    public void removeChild(Human human) {
        if (human != null) {
            children.remove(human);
        }
    }


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

    public String getPosition() {
        return "Человек";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void live() {
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }
}