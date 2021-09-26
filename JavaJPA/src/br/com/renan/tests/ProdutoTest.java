package br.com.renan.tests;

import br.com.renan.model.bean.Produto;
import br.com.renan.model.dao.ProdutoDAO;

/**
 *
 * @author renan
 */
public class ProdutoTest {
    
    public static void main(String[] args) {
        
        ProdutoDAO dao = new ProdutoDAO(); 
        
//        for (Produto produto : dao.findAll()){
//            System.out.println("Descrição: " + produto.getDescricao());
//            System.out.println("QTD: " + produto.getQdt());
//            System.out.println("Valor: " + produto.getValor());
//            System.out.println("Categoria: " + produto.getCategoria().getDescricao());
//        }

         dao.remove(2);
    }
    
}
