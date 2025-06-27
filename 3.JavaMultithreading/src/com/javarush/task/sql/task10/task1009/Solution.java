package com.javarush.task.sql.task10.task1009;

import com.javarush.task.sql.task10.task1006.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()
        ) {
            Query<Long> query = session.createQuery("select sum(salary) from Employee", Long.class);
            Long singleResult = query.getSingleResult();
            return singleResult;
        }
    }

    public static Double getAverageAge() {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession();
        ) {
            Query<Double> query = session.createQuery("select avg(age) from Employee", Double.class);
            Double singleResult = query.getSingleResult();
            return singleResult;
        }
    }
}