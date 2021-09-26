package com.renan.Biblioteca2.dao;

import com.renan.Biblioteca2.entities.Livro;
import javax.persistence.EntityManager;


public class LivroDAO {

    private EntityManager em;
    
    public LivroDAO(EntityManager em) {
        this.em = em;
    }
    
    public Livro salvar(Livro l) {
        em.getTransaction().begin();
        
        if(l.getId() == null) {
            em.persist(this);
        } else {
            em.merge(l);
        }
        
        em.getTransaction().commit();
        em.close();        
        return l;
    }
    
    public Livro consultarPorId(Long id) {
        return em.find(Livro.class, id);
    }
    
    public void remover (Livro l) {
        em.getTransaction().begin();
        
        l = this.consultarPorId(l.getId());
        em.remove(l);
        
        em.getTransaction().commit();
        em.close();        
    }
    
}
