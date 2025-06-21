package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

import org.apache.commons.lang3.ObjectUtils;

import java.lang.reflect.Field;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        if (studentOne == null || studentTwo == null) {
            return "Make sure there are no null objects";
        }

        int scoreOne = studentOne.getMathScore()
                + studentOne.getPhysicsScore()
                + studentOne.getChemistryScore()
                + studentOne.getBiologyScore()
                + studentOne.getGeographyScore()
                + studentOne.getHistoryScore()
                + studentOne.getEnglishScore();

        int scoreTwo = studentTwo.getMathScore()
                + studentTwo.getPhysicsScore()
                + studentTwo.getChemistryScore()
                + studentTwo.getBiologyScore()
                + studentTwo.getGeographyScore()
                + studentTwo.getHistoryScore()
                + studentTwo.getEnglishScore();

        int result = ObjectUtils.compare(scoreOne, scoreTwo);
        if (result > 0)
            return studentOne.getName() + " has a higher grades score";
        if (result < 0)
            return studentTwo.getName() + " has a higher grades score";
        return "Student grades scores are equal";
    }

    //Мой отдельный метод для суммирования каждого студента
//    public static int getTotalScore(Student s) {
//        int sum = 0;
//        Field[] declaredFields = Student.class.getDeclaredFields();
//        for (Field field : declaredFields) {
//            field.setAccessible(true);
//            Object value = null;
//            try {
//                value = field.get(s);
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//            if (value instanceof Integer && !field.getName().equals("name")) {
//                sum += (Integer) value;
//            }
//        }
//        return sum;
//    }
}
