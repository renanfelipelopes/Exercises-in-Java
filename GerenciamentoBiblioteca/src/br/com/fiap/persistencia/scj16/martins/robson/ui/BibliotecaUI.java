package br.com.fiap.persistencia.scj16.martins.robson.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.persistencia.scj16.martins.robson.Categoria;
import br.com.fiap.persistencia.scj16.martins.robson.Editora;
import br.com.fiap.persistencia.scj16.martins.robson.Emprestimo;
import br.com.fiap.persistencia.scj16.martins.robson.Livro;
import br.com.fiap.persistencia.scj16.martins.robson.Usuario;
import br.com.fiap.persistencia.scj16.martins.robson.negocio.BibliotecaNegocio;

/** 
 * Interface de Usuario do Gerenciador de Biblioteca
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */
public class BibliotecaUI {
	
	private final String NOME_SISTEMA  = "Sistema Gerenciador de Biblioteca";
	private final String AUTOR_SISTEMA = "FIAP/16SCJ - Robson Martins (RM:42055)";
	
	private final int OPCAO_CADASTRO_LIVROS   = 1;
	private final int OPCAO_ESTOQUE           = 2;
	private final int OPCAO_CADASTRO_USUARIOS = 3;
	private final int OPCAO_EMPRESTIMO        = 4;
	
	private final int OPCAO_CADASTRO_LIVROS_CADASTRAR = 1;
	private final int OPCAO_CADASTRO_LIVROS_EXCLUIR   = 2;
	private final int OPCAO_CADASTRO_LIVROS_CONSULTAR = 3;

	private final int OPCAO_ESTOQUE_ADICIONAR = 1;
	private final int OPCAO_ESTOQUE_REMOVER   = 2;
	private final int OPCAO_ESTOQUE_CONSULTAR = 3;
	
	private final int OPCAO_CADASTRO_USUARIOS_CADASTRAR = 1;
	private final int OPCAO_CADASTRO_USUARIOS_EXCLUIR   = 2;
	private final int OPCAO_CADASTRO_USUARIOS_CONSULTAR = 3;
	
	private final int OPCAO_EMPRESTIMO_RETIRAR       = 1;
	private final int OPCAO_EMPRESTIMO_DEVOLVER      = 2;
	private final int OPCAO_EMPRESTIMO_CONSULTAR     = 3;
	private final int OPCAO_EMPRESTIMO_HIST_LIVROS   = 4;
	private final int OPCAO_EMPRESTIMO_HIST_USUARIOS = 5;

	private final int OPCAO_VOLTAR            = 9;
	private final int OPCAO_QUIT              = 0;
	
	private BibliotecaNegocio bibliotecaNegocio = new BibliotecaNegocio();

	/**
	 * Executa a Interface de Usuario do Gerenciador de Biblioteca
	 */
	public void execute() {

		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		int opcao = 0;
		
		do {
			
			opcao = promptMenuPrincipal(input);
			
		} while (opcao != OPCAO_QUIT);

		System.out.println("Bye!");
		
	}

	/**
	 * Obtem um numero inteiro a partir do console
	 * @param input Objeto da classe {@link Scanner}
	 * @return Numero inteiro obtido ou -1 se houve erro.
	 */
	private int getIntFromInput(Scanner input) {

		int retorno = -1;
		
		try {
			retorno = input.nextInt();
		} catch (Exception ex) {
			input.nextLine();
			retorno = -1;
		}
		
		return retorno;
	}

	/**
	 * Obtem uma string a partir do console
	 * @param input Objeto da classe {@link Scanner}
	 * @return String obtida ou "" se houve erro.
	 */
	private String getStringFromInput(Scanner input) {
		
		String retorno = ""; 
		
		try {
			retorno = input.next();
		} catch (Exception ex) {
			input.nextLine();
			retorno = "";
		}
		
		return retorno;
	}

	/**
	 * Exibe um prompt para o usuario pressionar ENTER para continuar
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void promptEnterToContinue(Scanner input) {

		System.out.print("Pressione <ENTER> para continuar...");
		getStringFromInput(input);
	}

	/**
	 * Exibe um prompt para o usuario confirmar uma operacao (Sim ou Nao)
	 * @param input Objeto da classe {@link Scanner}
	 * @return True se houve confirmacao, false se nao.
	 */
	private boolean promptConfirma(Scanner input) {

		String opcao = null;
		
		do {
		
			System.out.print("Confirma (S/N)? ");
			opcao = getStringFromInput(input).trim().toUpperCase();
			
		} while (!"S".equals(opcao) && !"N".equals(opcao));
		
		return ("S".equals(opcao));
	}

	/**
	 * Exibe o Menu Principal e avalia a opcao escolhida pelo usuario
	 * @param input Objeto da classe {@link Scanner}
	 * @return Resultado da opcao escolhida.
	 */
	private int promptMenuPrincipal(Scanner input) {

		int opcao = -1;
		
		do {
		
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println(NOME_SISTEMA);
			System.out.println(AUTOR_SISTEMA);
			System.out.println("--------------------------------------");
			System.out.println("1 - Cadastro de Livros");
			System.out.println("2 - Estoque de Livros");
			System.out.println("3 - Cadastro de Usuarios");
			System.out.println("4 - Emprestimo de Livros");
			System.out.println("--------------------------------------");
			System.out.println("0 - Sair do Programa");
			System.out.println("--------------------------------------");
			
			opcao = getIntFromInput(input); 
				
			switch (opcao) {
			case OPCAO_CADASTRO_LIVROS:
				opcao = promptMenuCadastroLivros(input);
				break;
			case OPCAO_ESTOQUE:
				opcao = promptMenuEstoqueLivros(input);
				break;
			case OPCAO_CADASTRO_USUARIOS:
				opcao = promptMenuCadastroUsuarios(input);
				break;
			case OPCAO_EMPRESTIMO:
				opcao = promptMenuEmprestimoLivros(input);
				break;
			case OPCAO_QUIT:
				break;
			default:
				opcao = -1;
				break;
			}
		
		} while (opcao == -1);

		return opcao;
	}

	/**
	 * Exibe o Menu de Cadastro de Livros e avalia a opcao
	 * escolhida pelo usuario
	 * @param input Objeto da classe {@link Scanner}
	 * @return Resultado da opcao escolhida.
	 */
	private int promptMenuCadastroLivros(Scanner input) {

		int opcao = -1;
		
		do {
		
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println(NOME_SISTEMA);
			System.out.println(AUTOR_SISTEMA);
			System.out.println("--------------------------------------");
			System.out.println("Cadastro de Livros");
			System.out.println("--------------------------------------");
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Excluir Livro");
			System.out.println("3 - Consultar Livros");
			System.out.println("--------------------------------------");
			System.out.println("9 - Voltar ao Menu Principal");
			System.out.println("0 - Sair do Programa");
			System.out.println("--------------------------------------");
			
			opcao = getIntFromInput(input); 

			switch (opcao) {
			case OPCAO_CADASTRO_LIVROS_CADASTRAR:
				cadastrarLivro(input);
				opcao = -1;
				break;
			case OPCAO_CADASTRO_LIVROS_EXCLUIR:
				excluirLivro(input);
				opcao = -1;
				break;
			case OPCAO_CADASTRO_LIVROS_CONSULTAR:
				consultarLivros(input);
				opcao = -1;
				break;
			case OPCAO_VOLTAR:
			case OPCAO_QUIT:
				break;
			default:
				opcao = -1;
				break;
			}
			
		} while (opcao == -1);

		return opcao;
	}
	
	/**
	 * Exibe o Menu de Estoque de Livros e avalia a opcao
	 * escolhida pelo usuario
	 * @param input Objeto da classe {@link Scanner}
	 * @return Resultado da opcao escolhida.
	 */
	private int promptMenuEstoqueLivros(Scanner input) {

		int opcao = -1;
		
		do {
		
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println(NOME_SISTEMA);
			System.out.println(AUTOR_SISTEMA);
			System.out.println("--------------------------------------");
			System.out.println("Estoque de Livros");
			System.out.println("--------------------------------------");
			System.out.println("1 - Adicionar Exemplar");
			System.out.println("2 - Remover Exemplar");
			System.out.println("3 - Consultar Estoque");
			System.out.println("--------------------------------------");
			System.out.println("9 - Voltar ao Menu Principal");
			System.out.println("0 - Sair do Programa");
			System.out.println("--------------------------------------");
			
			opcao = getIntFromInput(input); 

			switch (opcao) {
			case OPCAO_ESTOQUE_ADICIONAR:
				adicionarLivroEstoque(input);
				opcao = -1;
				break;
			case OPCAO_ESTOQUE_REMOVER:
				removerLivroEstoque(input);
				opcao = -1;
				break;
			case OPCAO_ESTOQUE_CONSULTAR:
				consultarLivrosEstoque(input);
				opcao = -1;
				break;
			case OPCAO_VOLTAR:
			case OPCAO_QUIT:
				break;
			default:
				opcao = -1;
				break;
			}
			
		} while (opcao == -1);

		return opcao;
	}

	/**
	 * Exibe o Menu de Cadastro de Usuarios e avalia a opcao
	 * escolhida pelo usuario
	 * @param input Objeto da classe {@link Scanner}
	 * @return Resultado da opcao escolhida.
	 */
	private int promptMenuCadastroUsuarios(Scanner input) {

		int opcao = -1;
		
		do {
		
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println(NOME_SISTEMA);
			System.out.println(AUTOR_SISTEMA);
			System.out.println("--------------------------------------");
			System.out.println("Cadastro de Usuarios");
			System.out.println("--------------------------------------");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Excluir Usuario");
			System.out.println("3 - Consultar Usuarios");
			System.out.println("--------------------------------------");
			System.out.println("9 - Voltar ao Menu Principal");
			System.out.println("0 - Sair do Programa");
			System.out.println("--------------------------------------");
			
			opcao = getIntFromInput(input); 

			switch (opcao) {
			case OPCAO_CADASTRO_USUARIOS_CADASTRAR:
				cadastrarUsuario(input);
				opcao = -1;
				break;
			case OPCAO_CADASTRO_USUARIOS_EXCLUIR:
				excluirUsuario(input);
				opcao = -1;
				break;
			case OPCAO_CADASTRO_USUARIOS_CONSULTAR:
				consultarUsuarios(input);
				opcao = -1;
				break;
			case OPCAO_VOLTAR:
			case OPCAO_QUIT:
				break;
			default:
				opcao = -1;
				break;
			}
			
		} while (opcao == -1);

		return opcao;
	}

	/**
	 * Exibe o Menu de Emprestimo de Livros e avalia a opcao
	 * escolhida pelo usuario
	 * @param input Objeto da classe {@link Scanner}
	 * @return Resultado da opcao escolhida.
	 */
	private int promptMenuEmprestimoLivros(Scanner input) {

		int opcao = -1;
		
		do {
		
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println(NOME_SISTEMA);
			System.out.println(AUTOR_SISTEMA);
			System.out.println("--------------------------------------");
			System.out.println("Emprestimo de Livros");
			System.out.println("--------------------------------------");
			System.out.println("1 - Retirar Livro");
			System.out.println("2 - Devolver Livro");
			System.out.println("3 - Consultar Emprestimos");
			System.out.println("4 - Historico de Livros por Usuario");
			System.out.println("5 - Historico de Usuarios por Livro");
			System.out.println("--------------------------------------");
			System.out.println("9 - Voltar ao Menu Principal");
			System.out.println("0 - Sair do Programa");
			System.out.println("--------------------------------------");
			
			opcao = getIntFromInput(input); 

			switch (opcao) {
			case OPCAO_EMPRESTIMO_RETIRAR:
				retirarLivro(input);
				opcao = -1;
				break;
			case OPCAO_EMPRESTIMO_DEVOLVER:
				devolverLivro(input);
				opcao = -1;
				break;
			case OPCAO_EMPRESTIMO_CONSULTAR:
				consultarEmprestimo(input);
				opcao = -1;
				break;
			case OPCAO_EMPRESTIMO_HIST_LIVROS:
				consultarHistLivros(input);
				opcao = -1;
				break;
			case OPCAO_EMPRESTIMO_HIST_USUARIOS:
				consultarHistUsuarios(input);
				opcao = -1;
				break;
			case OPCAO_VOLTAR:
			case OPCAO_QUIT:
				break;
			default:
				opcao = -1;
				break;
			}
			
		} while (opcao == -1);

		return opcao;
	}

	/**
	 * Realiza uma Consulta de Livros Cadastrados
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void consultarLivros(Scanner input) {

		List<Livro> livros = bibliotecaNegocio.selecionarTodosLivros();
		
		if (livros == null || livros.size() == 0) {

			System.out.println("Nao ha' nenhum livro cadastrado.");
			
		} else {

			System.out.println("Lista de livros cadastrados:");
			
			for (Livro l : livros) {
				System.out.println("ISBN: " + l.getIsbn()   + " "
				         + "Titulo: \"" + l.getTitulo() + "\" "
				         + "Autor: \"" + l.getAutor()  + "\" "
				         + "Categoria: \"" + l.getCategoria().getDescricao() + "\" "
				         + "Editora: \"" + l.getEditora().getNome() + "\"");
			}
			
		}
		
		promptEnterToContinue(input);
	}

	/**
	 * Exclui um Livro do Cadastro
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void excluirLivro(Scanner input) {

		String isbnLivro = null;

		System.out.print("Digite o ISBN do livro a ser excluido: ");
		isbnLivro = getStringFromInput(input);

		if (promptConfirma(input)) {

			if (bibliotecaNegocio.excluirLivro(isbnLivro)) {
				
				System.out.println("Livro excluido com sucesso!");
				
			} else {
				
				System.out.println("Erro ao excluir livro.");
			}
			
		}

		promptEnterToContinue(input);
	}

	/**
	 * Cadatra um Livro
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void cadastrarLivro(Scanner input) {

		Livro     livro     = new Livro();
		Categoria categoria = new Categoria();
		Editora   editora   = new Editora();

		System.out.print("Digite a Categoria do Livro: ");
		categoria.setDescricao(getStringFromInput(input));
		
		System.out.print("Digite o ISBN do Livro: ");
		livro.setIsbn(getStringFromInput(input));
		
		System.out.print("Digite o Titulo do Livro: ");
		livro.setTitulo(getStringFromInput(input));
		
		System.out.print("Digite o Autor do Livro: ");
		livro.setAutor(getStringFromInput(input));
		
		System.out.print("Digite a Editora: ");
		editora.setNome(getStringFromInput(input));
		
		livro.setCategoria(categoria);
		livro.setEditora(editora);
		
		if (promptConfirma(input)) {
			
			if (bibliotecaNegocio.inserirLivro(livro, editora)) {
			
				System.out.println("ISBN: " + livro.getIsbn()   + " "
				         + "Titulo: \"" + livro.getTitulo() + "\" "
				         + "Autor: \"" + livro.getAutor()  + "\" "
				         + "Categoria: \"" + livro.getCategoria().getDescricao() + "\" "
				         + "Editora: \"" + livro.getEditora().getNome() + "\"");
				System.out.println("Livro cadastrado com sucesso!");
				
			} else {
				
				System.out.println("Erro ao cadastrar livro.");
			}
		} 

		promptEnterToContinue(input);
	}

	/**
	 * Realiza uma Consulta de Exemplares de Livros em Estoque
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void consultarLivrosEstoque(Scanner input) {

		List<Livro> livros = bibliotecaNegocio.selecionarTodosLivros();
		List<Livro> livrosEstoque = new ArrayList<Livro>();
		
		if (livros != null && livros.size() != 0) {

			for (Livro l : livros) {
				int quantidade =
					bibliotecaNegocio.buscarQuantidade(l.getIsbn());

				if (quantidade > 0) {
					livrosEstoque.add(l);
				}
			}
		}
		
		if (livrosEstoque.size() != 0) {
			
			System.out.println("Lista de livros em estoque:");

		} else {
			
			System.out.println("Nao ha' nenhum livro em estoque.");
		}
		
		for (Livro livro : livrosEstoque) {
			System.out.println("Qtd: " + livro.getEstoqueItems().size() + " "
					+ "ISBN: " + livro.getIsbn()   + " "
					+ "Titulo: \"" + livro.getTitulo() + "\" "
					+ "Autor: \"" + livro.getAutor()  + "\"");
			
		}
		
		promptEnterToContinue(input);
	}

	/**
	 * Remove Exemplares de Livros do Estoque
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void removerLivroEstoque(Scanner input) {

		String isbnLivro = null;
		int quantidade = -1;

		System.out.print("Digite o ISBN do livro a ser removido do estoque: ");
		isbnLivro = getStringFromInput(input);
		
		do {
			System.out.print("Digite a quantidade de exemplares a ser removida: ");
			quantidade = getIntFromInput(input);
		} while (quantidade == -1);

		if (promptConfirma(input)) {

			if (bibliotecaNegocio.removerLivroEstoque(isbnLivro, quantidade)) {
				
				System.out.println("Estoque atualizado com sucesso!");
				
			} else {
				
				System.out.println("Erro ao remover exemplares do estoque.");
			}
			
		}

		promptEnterToContinue(input);
	}

	/**
	 * Adiciona Exemplares de Livros ao Estoque
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void adicionarLivroEstoque(Scanner input) {

		String isbnLivro = null;
		int quantidade = -1;

		System.out.print("Digite o ISBN do livro a ser adicionado ao estoque: ");
		isbnLivro = getStringFromInput(input);
		
		do {
			System.out.print("Digite a quantidade de exemplares a ser adicionada: ");
			quantidade = getIntFromInput(input);
		} while (quantidade == -1);
		
		if (promptConfirma(input)) {
			
			if (bibliotecaNegocio.adicionarLivroEstoque(isbnLivro, quantidade)) {

				System.out.println("Estoque atualizado com sucesso!");
				
			} else {
				
				System.out.println("Erro ao adicionar exemplares ao estoque.");
			}
		} 

		promptEnterToContinue(input);
	}

	/**
	 * Realiza uma Consulta de Usuarios Cadastrados
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void consultarUsuarios(Scanner input) {

		List<Usuario> usuarios = bibliotecaNegocio.listarUsuarios();
		
		if (usuarios == null || usuarios.size() == 0) {

			System.out.println("Nao ha' nenhum usuario cadastrado.");
			
		} else {

			System.out.println("Lista de usuarios cadastrados:");
			
			for (Usuario usuario : usuarios) {
				System.out.println("Id: " + usuario.getIdUsuario()
						+ " Nome: \"" + usuario.getNome() + "\"");
			}
			
		}
		
		promptEnterToContinue(input);
	}

	/**
	 * Remove um Usuario do Cadastro
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void excluirUsuario(Scanner input) {

		int idUsuario = -1;

		do {
			System.out.print("Digite o ID do usuario a ser excluido: ");
			idUsuario = getIntFromInput(input);
		} while (idUsuario == -1);

		if (promptConfirma(input)) {

			if (bibliotecaNegocio.excluirUsuario(idUsuario)) {
				
				System.out.println("Usuario excluido com sucesso!");
				
			} else {
				
				System.out.println("Erro ao excluir usuario.");
			}
			
		}

		promptEnterToContinue(input);
	}

	/**
	 * Cadastra um Usuario
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void cadastrarUsuario(Scanner input) {

		Usuario usuario = new Usuario();

		System.out.print("Digite o nome do novo usuario: ");
		usuario.setNome(getStringFromInput(input));
		
		if (promptConfirma(input)) {
			
			if (bibliotecaNegocio.cadastrarUsuario(usuario)) {
			
				System.out.println("Id: " + usuario.getIdUsuario()
					+ " Nome: \"" + usuario.getNome() + "\"");
				System.out.println("Usuario cadastrado com sucesso!");
				
			} else {
				
				System.out.println("Erro ao cadastrar usuario.");
			}
		} 

		promptEnterToContinue(input);
	}

	/**
	 * Realiza uma Consulta do Historico de Emprestimos: Usuarios por Livro
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void consultarHistUsuarios(Scanner input) {

		String isbnLivro = null;

		System.out.print("Digite o ISBN do livro: ");
		isbnLivro = getStringFromInput(input);
		
		List<Usuario> usuarios = bibliotecaNegocio.localizarUsuario(isbnLivro);
		
		if (usuarios == null || usuarios.size() == 0) {

			System.out.println(
					"Nenhum usuario efetuou emprestimos para esse livro.");
			
		} else {

			System.out.println("Lista de usuarios que efetuaram emprestimos:");
			
			for (Usuario usuario : usuarios) {
				System.out.println("Id: " + usuario.getIdUsuario()
						+ " Nome: \"" + usuario.getNome() + "\"");
			}
			
		}
		
		promptEnterToContinue(input);
	}

	/**
	 * Realiza uma Consulta do Historico de Emprestimos: Livros por Usuario
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void consultarHistLivros(Scanner input) {

		int idUsuario = -1;

		do {
			System.out.print("Digite o ID do usuario: ");
			idUsuario = getIntFromInput(input);
		} while (idUsuario == -1);

		List<Livro> livros = bibliotecaNegocio.localizarLivro(idUsuario);
		
		if (livros == null || livros.size() == 0) {

			System.out.println(
					"O usuario nao efetuou emprestimo de nenhum livro.");
			
		} else {

			System.out.println("Lista de livros emprestados pelo usuario:");
			
			for (Livro l : livros) {
				System.out.println("ISBN: " + l.getIsbn()   + " "
				         + "Titulo: \"" + l.getTitulo() + "\" "
				         + "Autor: \"" + l.getAutor()  + "\" "
				         + "Categoria: \"" + l.getCategoria().getDescricao() + "\" "
				         + "Editora: \"" + l.getEditora().getNome() + "\"");
			}
			
		}
		
		promptEnterToContinue(input);
	}

	/**
	 * Realiza uma Consulta de um Emprestimo realizado
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void consultarEmprestimo(Scanner input) {

		int idUsuario = -1;
		String isbnLivro = null;
		Emprestimo emprestimo = null;

		System.out.print("Digite o ISBN do livro: ");
		isbnLivro = getStringFromInput(input);

		do {
			System.out.print("Digite o ID do usuario: ");
			idUsuario = getIntFromInput(input);
		} while (idUsuario == -1);

		
		if (promptConfirma(input)) {

			emprestimo =
				bibliotecaNegocio.consultarEmprestimo(isbnLivro, idUsuario);
			
			if (emprestimo != null) {
				
				Livro livro = emprestimo.getEmprestimoID().getLivro();
				Usuario usuario = emprestimo.getEmprestimoID().getUsuario();
				
				System.out.println("**** Livro:");

				System.out.println("ISBN: " + livro.getIsbn()   + " "
						+ "Titulo: \"" + livro.getTitulo() + "\" "
						+ "Autor: \"" + livro.getAutor()  + "\"");
				
				System.out.println("**** Usuario:");

				System.out.println("Id: " + usuario.getIdUsuario()
						+ " Nome: \"" + usuario.getNome() + "\"");
				
				System.out.println("**** Emprestimo:");
				
				System.out.print("Data Emprestimo: "
						+ emprestimo.getDtEmprestimo());
				
				if (emprestimo.getDtDevolucao() != null) {

					System.out.print(" Data Devolucao: "
							+ emprestimo.getDtDevolucao());
				}
						
				System.out.println();
				
			} else {
				
				System.out.println("Emprestimo nao realizado.");
			}
			
		}

		promptEnterToContinue(input);
	}

	/**
	 * Realiza a Devolucao de um Livro
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void devolverLivro(Scanner input) {

		int idUsuario = -1;
		String isbnLivro = null;

		System.out.print("Digite o ISBN do livro: ");
		isbnLivro = getStringFromInput(input);

		do {
			System.out.print("Digite o ID do usuario: ");
			idUsuario = getIntFromInput(input);
		} while (idUsuario == -1);

		
		if (promptConfirma(input)) {

			if (bibliotecaNegocio.devolverLivro(isbnLivro, idUsuario)) {
				
				System.out.println("Devolucao realizada com sucesso!");
				
			} else {
				
				System.out.println("Erro ao devolver livro.");
			}
			
		}

		promptEnterToContinue(input);
	}

	/**
	 * Realiza a Retirada de um Livro
	 * @param input Objeto da classe {@link Scanner}
	 */
	private void retirarLivro(Scanner input) {

		int idUsuario = -1;
		String isbnLivro = null;

		System.out.print("Digite o ISBN do livro: ");
		isbnLivro = getStringFromInput(input);

		if (bibliotecaNegocio.buscarQuantidade(isbnLivro) < 1) {
			
			System.out.println("Livro indisponivel.");
			promptEnterToContinue(input);
			return;
		}

		do {
			System.out.print("Digite o ID do usuario: ");
			idUsuario = getIntFromInput(input);
		} while (idUsuario == -1);

		if (promptConfirma(input)) {

			if (bibliotecaNegocio.retirarLivro(isbnLivro, idUsuario)) {
				
				System.out.println("Emprestimo realizado com sucesso!");
				
			} else {
				
				System.out.println("Erro ao emprestar livro.");
			}
			
		}

		promptEnterToContinue(input);
	}
}
