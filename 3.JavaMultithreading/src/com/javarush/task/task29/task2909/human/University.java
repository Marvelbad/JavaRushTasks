package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;
    private String name;
    private int age;

    public University(String name, int age) {
        this.students = new ArrayList<>();
        this.name = name;
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students) {
            if (Math.abs(student.getAverageGrade() - averageGrade) < 0.0001) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student topStudent = null;
        double maxGrade = Double.MIN_VALUE;
        for (Student student : students) {
            if (student.getAverageGrade() > maxGrade) {
                maxGrade = student.getAverageGrade();
                topStudent = student;
            }
        }
        return topStudent;
    }

    public Student getStudentWithMinAverageGrade() {
        Student worstStudent = null;
        double minGrade = Double.MAX_VALUE;
        for (Student student : students) {
            if (student.getAverageGrade() < minGrade) {
                minGrade = student.getAverageGrade();
                worstStudent = student;
            }
        }
        return worstStudent;
    }

    public void expel(Student student) {
        // Проверяем, есть ли студент в списке, прежде чем удалять.
        // Это защита от попытки удалить несуществующего объекта.
        if (students.contains(student)) {
            students.remove(student);
        }
    }
}