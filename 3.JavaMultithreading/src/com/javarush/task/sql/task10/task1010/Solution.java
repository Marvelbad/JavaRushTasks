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
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()
        ) {
            String sql = "SELECT * FROM employee ORDER BY id";
            NativeQuery<Employee> nativeQuery = session.createNativeQuery(sql, Employee.class);
            List<Employee> resultList = nativeQuery.getResultList();
            return resultList;
        }

    }
}