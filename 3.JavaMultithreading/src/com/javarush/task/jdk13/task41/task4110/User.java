package com.javarush.task.jdk13.task41.task4110;

import java.util.List;

public class User {

    public static void main(String[] args) {
        User user = User.builder().age(15).name("hfuf").build();
    }
    private String name;
    private String lastName;
    private int age;
    private List<String> pets;

    User(String name, String lastName, int age, List<String> pets) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.pets = pets;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    public static class UserBuilder {
        private String name;
        private String lastName;
        private int age;
        private List<String> pets;

        UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder pets(List<String> pets) {
            this.pets = pets;
            return this;
        }

        public User build() {
            return new User(this.name, this.lastName, this.age, this.pets);
        }

        public String toString() {
            return "User.UserBuilder(name=" + this.name + ", lastName=" + this.lastName + ", age=" + this.age + ", pets=" + this.pets + ")";
        }
    }
}
