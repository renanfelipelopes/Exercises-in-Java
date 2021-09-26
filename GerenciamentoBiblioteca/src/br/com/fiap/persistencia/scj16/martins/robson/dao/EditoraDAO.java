package br.com.fiap.persistencia.scj16.martins.robson.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.fiap.persistencia.scj16.martins.robson.Editora;

/**
 * Acesso a Dados (DAO) da classe {@link Editora}
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */
public class EditoraDAO extends GenericDAO<Editora> {

	/**
	 * Localiza uma Editora pelo nome
	 * @param nome Nome da Editora
	 * @return Objeto da classe Editora
	 */
	public Editora localizar(String nome) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		Editora editora = null;
		
		try {

			t.begin();
			Query q = em.createQuery("from Editora where nome like :nome");
			q.setParameter("nome", nome);
			editora = (Editora) q.getSingleResult();
			t.commit();

		} catch (Exception e) {

			if (debugInfo) {
				e.printStackTrace();
			}
			if (t.isActive()) t.rollback();

		} finally {

			em.close();
		}

		return editora;
	}
}
