package com.renan.Biblioteca2.dao;

import com.renan.Biblioteca2.entities.Cliente;
import javax.persistence.EntityManager;

public class ClienteDAO {
    
    private EntityManager em;
    
    private ClienteDAO(EntityManager em) {
        this.em = em;
    }    
    
    public Cliente salvar(Cliente c) {
        
        em.getTransaction().begin();
        
        if(c.getId() == null) {
            this.em.persist(c);
        } else {
            c = em.merge(c);
        }
        
        em.getTransaction().commit();
        em.close();
        
        return c;
    }
    
    public Cliente consultarPorId(Long id) {
        return em.find(Cliente.class, id);
    }
    
    public void remove(Cliente c) {
        
        em.getTransaction().begin();
        
        c = this.consultarPorId(c.getId());
        em.remove(c);
        
        em.getTransaction().commit();
        em.close();
    } 
    
}
