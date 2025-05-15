package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : getStudents()) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double max = Double.MIN_VALUE;
        Student bestStudent = null;
        for (Student student : getStudents()) {
            if (student.getAverageGrade() > max) {
                bestStudent = student;
                max = student.getAverageGrade();
            }
        }
        return bestStudent;
    }

    public Student getStudentWithMinAverageGrade() {
        double min = Double.MAX_VALUE;
        Student worstStudent = null;
        for (Student student : getStudents()) {
            if (student.getAverageGrade() < min) {
                worstStudent = student;
                min = student.getAverageGrade();
            }
        }
        return worstStudent;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}