package com.javarush.task.sql.task09.task0903;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/* 
task0903
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.driver" ,"com.mysql.jdbc.Driver");
        properties.setProperty("hibernate.connection.url" ,"jdbc:mysql://localhost:3306/test");
        properties.setProperty("hibernate.dialect" ,"org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.connection.username", "root");
        properties.setProperty("hibernate.connection.password", "root");

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Animal.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
    }
}