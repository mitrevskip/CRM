/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crm;

import org.hibernate.Session;

/**
 *
 * @author Petar
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setEmail("mitrevski.p@gmail.com");

        Session sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

//        Here I am goin to perform basic database operations using Hibernate provided functions
            user = (User) session.get(User.class, 1);

            System.out.println("User Object having student name as: " + user.getUserName());

            session.save(user);

            session.getTransaction().commit();
        }
    }

}
