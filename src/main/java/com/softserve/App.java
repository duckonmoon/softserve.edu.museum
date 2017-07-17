package com.softserve;

import com.softserve.dao.ExcursionsDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 */
public class App {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        ExcursionsDaoImpl exc = new ExcursionsDaoImpl();
//        for (int i = 0 ; i<exc.doSmth().size();i++)
//        {
//            System.out.println(exc.doSmth().get(i));
//        }
        entityManagerFactory.close();




    }
}
