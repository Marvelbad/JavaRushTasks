package com.javarush.task.sql.task10.task1006;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.type.ListType;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
task1006
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getBetween(25, 32).forEach(System.out::println);
    }

    public static List<Employee> getBetween(int from, int to) {
        List<Employee> resultList = null;
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession();
        ) {
            Query query = session.createQuery(
                    "from Employee where age > :from and age < :to order by age",
                    Employee.class);
            query.setParameter("from", from);
            query.setParameter("to", to);
            resultList = query.getResultList();
        }

        return resultList;
    }
}