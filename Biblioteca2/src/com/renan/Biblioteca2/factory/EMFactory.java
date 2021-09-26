package com.renan.Biblioteca2.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EMFactory {
    
    public static EntityManager conexao() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BibliotecaPU");
        EntityManager em = factory.createEntityManager();
        factory.close();
        return em;
    }
}