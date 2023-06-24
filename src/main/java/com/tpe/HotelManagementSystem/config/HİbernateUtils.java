package com.tpe.HotelManagementSystem.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HİbernateUtils {

    private static SessionFactory sessionFactory;

    static {

        try {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        } catch (Throwable ex) {
            System.out.println("Initial SessionFactory creation is failed..." + ex);
            System.err.println("Initial SessionFactory creation is failed..." + ex); //
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutDown() {
        getSessionFactory().close();
    }

    public static void closeSession(Session session) {
        if (session != null && session.isOpen()) {
            session.close();
        }
    }
}
