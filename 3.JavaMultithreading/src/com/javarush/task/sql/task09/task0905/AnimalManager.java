package com.javarush.task.sql.task09.task0905;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Properties;

public class AnimalManager {
    private SessionFactory sessionFactory;

    public AnimalManager() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");

        sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Animal.class)
                .buildSessionFactory();
    }

    public List<Animal> getAllAnimals() {
        try (Session session = sessionFactory.openSession()) {
            Query<Animal> query = session.createQuery("from Animal", Animal.class);
            return query.list();
        }
    }

    public void addAnimal(Animal animal) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.persist(animal);
                transaction.commit();
            } catch (HibernateException e) {
                if (transaction != null) transaction.rollback();
                throw e;
            }
        }
    }

    public void removeAnimal(Animal animal) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.remove(animal);
                transaction.commit();
            } catch (HibernateException e) {
                if (transaction != null) transaction.rollback();
                throw e;
            }
        }
    }
}
