package br.com.fiap.persistencia.scj16.martins.robson.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.fiap.persistencia.scj16.martins.robson.Emprestimo;
import br.com.fiap.persistencia.scj16.martins.robson.EmprestimoID;
import br.com.fiap.persistencia.scj16.martins.robson.Estoque;
import br.com.fiap.persistencia.scj16.martins.robson.Livro;
import br.com.fiap.persistencia.scj16.martins.robson.Usuario;

/**
 * Acesso a Dados (DAO) da classe {@link Emprestimo}
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */
public class EmprestimoDAO extends GenericDAO<Emprestimo> {

	/**
	 * Retira um Livro para Emprestimo
	 * @param livro Livro a ser emprestado
	 * @param usuario Usuario que esta' emprestando o Livro
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean retirar(Livro livro, Usuario usuario) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		boolean result = false;

		EmprestimoID emprestimoID = new EmprestimoID();
		Emprestimo emprestimo = new Emprestimo();
		
		try {

			t.begin();
			
			livro   = em.find(Livro.class, livro.getIsbn());
			usuario = em.find(Usuario.class, usuario.getIdUsuario());
			
			List<Estoque> estoqueItems = livro.getEstoqueItems(); 
			Estoque estoque = estoqueItems.get(estoqueItems.size() - 1);
			estoqueItems.remove(estoque);
			
			emprestimoID.setLivro(livro);
			emprestimoID.setUsuario(usuario);
			
			emprestimo.setEmprestimoID(emprestimoID);
			emprestimo.setDtEmprestimo(new Date());
			
			em.remove(estoque);
			em.persist(emprestimo);
			
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
	 * Devolve um Livro Emprestado
	 * @param livro Livro a ser devolvido
	 * @param usuario Usuario que esta' devolvendo o Livro
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean devolver(Livro livro, Usuario usuario) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		boolean result = false;

		Estoque estoque = new Estoque();
		EmprestimoID emprestimoID = new EmprestimoID();
		Emprestimo emprestimo = null;
		
		
		try {

			t.begin();
			
			livro   = em.find(Livro.class, livro.getIsbn());
			usuario = em.find(Usuario.class, usuario.getIdUsuario());
			
			emprestimoID.setLivro(livro);
			emprestimoID.setUsuario(usuario);
			
			emprestimo = em.find(Emprestimo.class, emprestimoID);
			
			/* verifica se livro nao foi devolvido ainda */
			if (emprestimo.getDtDevolucao() == null) { 
		
				emprestimo.setDtDevolucao(new Date());

				estoque.setLivro(livro);
				List<Estoque> estoqueItems = livro.getEstoqueItems(); 
				estoqueItems.add(estoque);
			
				em.persist(estoque);
				em.persist(emprestimo);
				
				result = true;
				
			} else { /* livro ja' devolvido */
				
				result = false;
			}
			
			t.commit();

		} catch (Exception e) {

			if (debugInfo) {
				e.printStackTrace();
			}
			if (t.isActive()) t.rollback();
			result = false;

		} finally {

			em.close();

		}
		
		return result;
	}

	/**
	 * Consulta um Emprestimo realizado
	 * @param livro Livro emprestado
	 * @param usuario Usuario que emprestou o Livro 
	 * @return Objeto da classe Emprestimo.
	 */
	public Emprestimo consultar(Livro livro, Usuario usuario) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		Emprestimo result = null;
		EmprestimoID emprestimoID = new EmprestimoID();
		
		try {

			t.begin();
			
			livro   = em.find(Livro.class, livro.getIsbn());
			usuario = em.find(Usuario.class, usuario.getIdUsuario());
			
			emprestimoID.setLivro(livro);
			emprestimoID.setUsuario(usuario);
			
			result = em.find(Emprestimo.class, emprestimoID);

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
	 * Lista todos os Livros que foram emprestados por um Usuario
	 * @param usuario Usuario que emprestou os Livros
	 * @return Lista de Livros.
	 */
	@SuppressWarnings("unchecked")
	public List<Livro> localizar(Usuario usuario) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();

		List<Livro> result = new ArrayList<Livro>();
		List<Emprestimo> emprestimoItems = null;
		
		try {

			t.begin();

			Query q = em.createQuery(
				"from Emprestimo where emprestimoID.usuario.idUsuario = :id");
			q.setParameter("id", usuario.getIdUsuario());
			emprestimoItems = (List<Emprestimo>) q.getResultList();
			
			for (Emprestimo emprestimo : emprestimoItems) {

				result.add(emprestimo.getEmprestimoID().getLivro());
			}

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
	 * Lista todos os Usuarios que emprestaram um Livro
	 * @param livro Livro que foi emprestado
	 * @return Lista de Usuarios.
	 */
	@SuppressWarnings("unchecked")
	public List<Usuario> localizar(Livro livro) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();

		List<Usuario> result = new ArrayList<Usuario>();
		List<Emprestimo> emprestimoItems = null;
		
		try {

			t.begin();

			Query q = em.createQuery(
					"from Emprestimo where emprestimoID.livro.isbn = :isbn");
			q.setParameter("isbn", livro.getIsbn());
			emprestimoItems = (List<Emprestimo>) q.getResultList();
			
			for (Emprestimo emprestimo : emprestimoItems) {

				result.add(emprestimo.getEmprestimoID().getUsuario());
			}

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
}
