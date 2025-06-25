package com.javarush.task.sql.task10.task1002;

import com.javarush.task.sql.task10.task1001.MySessionFactory;
import jakarta.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory()) {
            try {
                Session session = sessionFactory.openSession();
                Query<Employee> query = session.createQuery(
                        "from Employee e where e.smth = 'director'", Employee.class);
                Employee result = query.getSingleResult();
                return result;
            } catch (NoResultException e) {
                throw new RuntimeException(e);
            }
        }
    }
}