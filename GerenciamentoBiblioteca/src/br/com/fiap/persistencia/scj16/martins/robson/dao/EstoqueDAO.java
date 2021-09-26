package br.com.fiap.persistencia.scj16.martins.robson.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.fiap.persistencia.scj16.martins.robson.Estoque;
import br.com.fiap.persistencia.scj16.martins.robson.Livro;

/**
 * Acesso a Dados (DAO) da classe {@link Estoque}
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */
public class EstoqueDAO extends GenericDAO<Estoque> {

	/**
	 * Retorna a Quantidade de Exemplares de um Livro em Estoque.
	 * @param livro Livro
	 * @return Quantidade de Exemplares.
	 */
	public int buscarQuantidade(Livro livro) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		int result = 0;

		try {

			t.begin();

			Query q = em.createQuery("from Estoque where isbnLivro = :isbn");
			q.setParameter("isbn", livro.getIsbn());
			result = q.getResultList().size();

			t.commit();

		} catch (Exception e) {

			if (debugInfo) {
				e.printStackTrace();
			}
			if (t.isActive()) t.rollback();

		} finally {

			em.close();
		}
		
		return result;
	}

	/**
	 * Adiciona Exemplares de um Livro ao Estoque
	 * @param livro Livro a ser adicionado
	 * @param quantidade Quantidade de Exemplares
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean inserir(Livro livro, int quantidade) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		boolean result = false;
		Estoque estoque = null;
		
		try {

			t.begin();

			livro = em.find(Livro.class, livro.getIsbn());
			
			for (int i = 0; i < quantidade; i++) {
				
				estoque = new Estoque();
				estoque.setLivro(livro);
				em.persist(estoque);
			}
			
			t.commit();
			result = true;

		} catch (Exception e) {

			if (debugInfo) {
				e.printStackTrace();
			}
			if (t.isActive()) t.rollback();

		} finally {

			em.close();

		}
		
		return result;
	}

	/**
	 * Remove Exemplares de um Livro do Estoque
	 * @param isbn ISBN do Livro
	 * @param quantidade Quantidade de Exemplares
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean excluir(String isbn, int quantidade) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		boolean result = false;
		List<Estoque> estoqueItems = null;
		Livro livro = null;
		Estoque estoque = null;

		try {

			t.begin();

			livro = em.find(Livro.class, isbn);
			estoqueItems = livro.getEstoqueItems();
			
			while (quantidade > 0 && estoqueItems.size() != 0) {
				
				estoque = estoqueItems.get(estoqueItems.size() - 1);
				estoqueItems.remove(estoque);
				em.remove(estoque);
				quantidade--;
			}
			
			em.merge(livro);
			t.commit();
			result = true;

		} catch (Exception e) {

			if (debugInfo) {
				e.printStackTrace();
			}
			if (t.isActive()) t.rollback();

		} finally {

			em.close();
		}
		
		return result;
	}
}
