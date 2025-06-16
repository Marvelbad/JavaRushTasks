package com.javarush.task.sql.task07.task0709;

import java.sql.*;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT employee.name, weight, birthday, inn FROM employee");
        ) {
            while (resultSet.next()) {
                Object name = resultSet.getObject("name");
                Object weight = resultSet.getObject("weight");
                Object birthday = resultSet.getObject("birthday");
                Object inn = resultSet.getObject("inn");

                System.out.println(name + " " + weight + " " + birthday + " " + inn);
            }
        }
    }
}
