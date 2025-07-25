package com.javarush.task.sql.task10.task1001;

import com.javarush.task.sql.task09.task0904.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()
        ) {
            String hql = "select distinct smth from Employee where age > 18 order by smth";
            Query<String> query = session.createQuery(hql, String.class);
            List<String> resultList = query.getResultList();
            resultList.forEach(System.out::println);
        }
    }
}