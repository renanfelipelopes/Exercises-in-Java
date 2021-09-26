package br.com.renan.tests;

import br.com.renan.connection.ConnectionFactory;
import br.com.renan.model.bean.Categoria;
import br.com.renan.model.dao.CategoriaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriaTeste {
    
    public static void main(String[] args){
        
        CategoriaDAO dao = new CategoriaDAO();
        
        dao.remove(3);
        
//        for(Categoria c: dao.findAll()){
//            System.out.println("Descrição: " + c.getDescricao());
//        }
               
    }
    
}
