package com.javarush.task.sql.task10.task1010;

import com.javarush.task.sql.task10.task1005.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
task1010
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getAll().forEach(System.out::println);
    }

    public static List<Employee> getAll() {
        List<Employee> employees = null;
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()
        ) {
            NativeQuery<Employee> nativeQuery = session.createNativeQuery(
                    "SELECT * FROM employee ORDER BY id", Employee.class);
            employees = nativeQuery.getResultList();
        }

        return employees;
    }
}