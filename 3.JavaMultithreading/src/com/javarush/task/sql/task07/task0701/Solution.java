package com.javarush.task.sql.task07.task0701;

import java.sql.*;

/* 
task0701
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    "root", "root");
        } catch (SQLException e) {
            System.out.println("Connection lost");
        } finally {
            connection.close();
        }
    }
}
