package br.com.fiap.persistencia.scj16.martins.robson.negocio;

import java.util.List;

import br.com.fiap.persistencia.scj16.martins.robson.Editora;
import br.com.fiap.persistencia.scj16.martins.robson.Emprestimo;
import br.com.fiap.persistencia.scj16.martins.robson.Livro;
import br.com.fiap.persistencia.scj16.martins.robson.Usuario;
import br.com.fiap.persistencia.scj16.martins.robson.dao.EmprestimoDAO;
import br.com.fiap.persistencia.scj16.martins.robson.dao.EstoqueDAO;
import br.com.fiap.persistencia.scj16.martins.robson.dao.LivroDAO;
import br.com.fiap.persistencia.scj16.martins.robson.dao.UsuarioDAO;

/**
 * Classe de Negocio do Gerenciador de Biblioteca 
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */
public class BibliotecaNegocio {
	
	/**
	 * Cadastra um Usuario
	 * @param usuario Usuario a ser cadastrado
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean cadastrarUsuario(Usuario usuario) {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.inserir(usuario);
	}

	/**
	 * Remove um Usuario do Cadastro
	 * @param id Id do Usuario a ser removido
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean excluirUsuario(int id) {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.excluir(id);
	}

	/**
	 * Lista todos Usuarios Cadastrados
	 * @return Lista de Usuarios
	 */
	public List<Usuario> listarUsuarios() {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.listar();
	}
	
	/**
	 * Cadastra um Livro
	 * @param livro Livro a ser cadastrado
	 * @param editora Editora correspondente ao Livro a ser cadastrado
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean inserirLivro(Livro livro, Editora editora) {
		
		LivroDAO livroDAO = new LivroDAO();
		return livroDAO.inserir(livro, editora);
	}
	
	/**
	 * Remove um Livro do Cadastro
	 * @param isbn ISBN do Livro a ser removido
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean excluirLivro(String isbn) {
		
		LivroDAO livroDAO = new LivroDAO();
		return livroDAO.excluir(isbn);
	}

	/**
	 * Lista todos Livros Cadastrados
	 * @return Lista de Livros
	 */
	public List<Livro> selecionarTodosLivros() {

		LivroDAO livroDAO = new LivroDAO();
		return livroDAO.listar();
	}
	
	/**
	 * Adiciona Exemplares de Livros ao Estoque
	 * @param isbn ISBN do Livro
	 * @param quantidade Quantidade de Exemplares a ser adicionada
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean adicionarLivroEstoque(String isbn, int quantidade) {

		EstoqueDAO estoqueDAO = new EstoqueDAO();
		LivroDAO livroDAO = new LivroDAO();
		
		Livro livro = livroDAO.localizar(isbn);
		return estoqueDAO.inserir(livro, quantidade);
	}

	/**
	 * Remove Exemplares de Livros do Estoque
	 * @param isbn ISBN do Livro
	 * @param quantidade Quantidade de Exemplares a ser adicionada
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean removerLivroEstoque(String isbn, int quantidade) {

		EstoqueDAO estoqueDAO = new EstoqueDAO();
		return estoqueDAO.excluir(isbn, quantidade);
	}
	
	/**
	 * Retorna a Quantidade de Exemplares de um Livro em Estoque 
	 * @param isbn ISBN do Livro
	 * @return Quantidade de Exemplares em Estoque.
	 */
	public int buscarQuantidade(String isbn) {

		EstoqueDAO estoqueDAO = new EstoqueDAO();
		LivroDAO livroDAO = new LivroDAO();
		
		Livro livro = livroDAO.localizar(isbn);
		return estoqueDAO.buscarQuantidade(livro);
	}

	/**
	 * Retira um Livro para Emprestimo	
	 * @param isbnLivro ISBN do Livro a ser emprestado
	 * @param idUsuario Id do Usuario
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean retirarLivro(String isbnLivro, int idUsuario) {

		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
		LivroDAO livroDAO = new LivroDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Livro livro = livroDAO.localizar(isbnLivro);
		Usuario usuario = usuarioDAO.localizar(idUsuario);
		return emprestimoDAO.retirar(livro, usuario);
	}

	/**
	 * Devolve um Livro Emprestado
	 * @param isbnLivro ISBN do Livro emprestado
	 * @param idUsuario Id do Usuario
	 * @return True se bem sucedido, false se houve erro.
	 */
	public boolean devolverLivro(String isbnLivro, int idUsuario) {

		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
		LivroDAO livroDAO = new LivroDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Livro livro = livroDAO.localizar(isbnLivro);
		Usuario usuario = usuarioDAO.localizar(idUsuario);
		return emprestimoDAO.devolver(livro, usuario);
	}
	
	/**
	 * Consulta um Emprestimo realizado
	 * @param isbnLivro ISBN do Livro emprestado
	 * @param idUsuario Id do Usuario
	 * @return Objeto da classe {@link Emprestimo}
	 */
	public Emprestimo consultarEmprestimo(String isbnLivro, int idUsuario) {

		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
		LivroDAO livroDAO = new LivroDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Livro livro = livroDAO.localizar(isbnLivro);
		Usuario usuario = usuarioDAO.localizar(idUsuario);
		return emprestimoDAO.consultar(livro, usuario);
	}

	/**
	 * Retorna uma Lista de Livros emprestados a um Usuario
	 * @param idUsuario Id do Usuario
	 * @return Lista de Livros
	 */
	public List<Livro> localizarLivro(int idUsuario) {

		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Usuario usuario = usuarioDAO.localizar(idUsuario);
		return emprestimoDAO.localizar(usuario);
	}
	
	/**
	 * Retorna uma Lista de Usuarios que ja' emprestaram um Livro
	 * @param isbnLivro ISBN do Livro
	 * @return Lista de Usuarios
	 */
	public List<Usuario> localizarUsuario(String isbnLivro) {

		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
		LivroDAO livroDAO = new LivroDAO();
		
		Livro livro = livroDAO.localizar(isbnLivro);
		return emprestimoDAO.localizar(livro);
	}
}
