package com.codegym.module4.customermanagementthymeleaf.Service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateCustomerService {
    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            try {
                entityManagerFactory = Persistence.createEntityManagerFactory("your_persistence_unit_name");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return entityManagerFactory;
    }
    public static void shutdown() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}

