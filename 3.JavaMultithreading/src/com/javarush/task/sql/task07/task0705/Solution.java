package com.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
task0705
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT MIN(DISTINCT age)  AS  min_age FROM employee");
        ) {
            while (resultSet.next()) {
                int age = resultSet.getInt("min_age");
                System.out.println(age);
            }
        }
    }
}
