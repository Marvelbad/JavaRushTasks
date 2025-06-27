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
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession();
        ) {
            String hql = "from Employee where age > :FROM and age < :TO order by age";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.setParameter("FROM", from);
            query.setParameter("TO", to);
            List<Employee> resultList = query.getResultList();
            return resultList;
        }
    }
}