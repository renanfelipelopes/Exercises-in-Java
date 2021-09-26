package br.com.fiap.persistencia.scj16.martins.robson.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.fiap.persistencia.scj16.martins.robson.Categoria;
import br.com.fiap.persistencia.scj16.martins.robson.Editora;
import br.com.fiap.persistencia.scj16.martins.robson.Livro;

/**
 * Acesso a Dados (DAO) da classe {@link Livro}
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */

public class LivroDAO extends GenericDAO<Livro> {
	
	/**
	 * Localiza um Livro pelo ISBN
	 * @param isbn ISBN do Livro
	 * @return Objeto da classe Livro
	 */
	public Livro localizar(String isbn) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		Livro livro = null;
		
		try {

			t.begin();
			Query q = em.createQuery("from Livro where isbn = :isbn");
			q.setParameter("isbn", isbn);
			livro = (Livro) q.getSingleResult();
			t.commit();

		} catch (Exception e) {

			if (debugInfo) {
				e.printStackTrace();
			}
			if (t.isActive()) t.rollback();

		} finally {

			em.close();
		}

		return livro;
	}

	/**
	 * Adiciona (Insere) um Livro
	 * @param livro Livro a ser persistido
	 * @param editora Editora do Livro
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean inserir(Livro livro, Editora editora) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		boolean result = false;
		Categoria existentCategoria = null;
		Editora existentEditora = null;
		Query q = null;
		
		try {

			t.begin();

			/* verifica se ja' existe uma categoria com a mesma descricao */
			q = em.createQuery("from Categoria where descricao like :descricao");
			q.setParameter("descricao", livro.getCategoria().getDescricao());

			try {
				existentCategoria = (Categoria) q.getSingleResult();
				if (existentCategoria != null) {
					livro.setCategoria(existentCategoria);
				}
			} catch(Exception e) { }
			
			/* verifica se ja' existe uma editora com o mesmo nome */
			q = em.createQuery("from Editora where nome like :nome");
			q.setParameter("nome", livro.getEditora().getNome());

			try {
				existentEditora = (Editora) q.getSingleResult();
				if (existentEditora != null) {
					editora = existentEditora;
				}
			} catch(Exception e) { }
			
			livro.setEditora(editora);
			
			em.persist(livro);
			
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
	 * Exclui um Livro persisitido, pelo ISBN
	 * @param isbn ISBN do Livro
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean excluir(String isbn) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		Livro livro = null;
		boolean result = false;

		try {

			t.begin();
			Query q = em.createQuery("from Livro where isbn = :isbn");
			q.setParameter("isbn", isbn);
			
			livro = (Livro) q.getSingleResult();
			em.remove(livro);
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
