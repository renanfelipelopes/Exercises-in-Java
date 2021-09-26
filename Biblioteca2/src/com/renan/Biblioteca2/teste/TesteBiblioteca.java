package com.renan.Biblioteca2.teste;

import com.renan.Biblioteca2.dao.LivroDAO;
import com.renan.Biblioteca2.entities.Livro;
import com.renan.Biblioteca2.factory.EMFactory;

public class TesteBiblioteca {
    
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setAutor("Renan");
        l.setTitulo("PHP e vc tudo a ver");
        l.setIsbn("111-11-1111-111-1");
        l.setPaginas(396l);
        
        LivroDAO dao = new LivroDAO(EMFactory.conexao());
        dao.salvar(l);
    }
    
}
