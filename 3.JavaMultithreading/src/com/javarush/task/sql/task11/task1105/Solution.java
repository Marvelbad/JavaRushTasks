package com.javarush.task.sql.task11.task1105;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
task1105
*/

public class Solution {
    public static Animal animalCat = new Animal();
    public static Animal animalMouse = new Animal();
    public static Animal animalRemove;

    public static void main(String[] args) throws Exception {
        animalCat.setId(1L);
        animalCat.setName("Tom");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");

        animalMouse.setId(2L);
        animalMouse.setName("Jerry");
        animalMouse.setAge(3);
        animalMouse.setFamily("Mice");

        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(animalCat);
            session.persist(animalMouse);

            session.createQuery(
                            "delete from Animal where id = 2")
                    .executeUpdate();


            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}