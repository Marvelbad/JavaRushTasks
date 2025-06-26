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
        Long salaryResult = 0L;
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()
        ) {
            Query<Long> query = session.createQuery(
                    "select sum(salary) from Employee");
            salaryResult = query.getSingleResult();
        }
        return salaryResult;
    }

    public static Double getAverageAge() {
        Double averageResult = 0.0;
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession();
        ) {
            Query<Double> query = session.createQuery(
                    "select avg(age) from Employee");
            averageResult = query.getSingleResult();
        }
        return averageResult;
    }
}