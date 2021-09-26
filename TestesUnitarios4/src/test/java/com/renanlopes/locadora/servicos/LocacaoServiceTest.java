/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em Análise e Desenvolvimento de Sistemas 
* Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.locadora.servicos;

import static com.renanlopes.locadora.utils.DataUtils.isMesmaData;
import static com.renanlopes.locadora.utils.DataUtils.obterDataComDiferencaDias;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import com.renanlopes.locadora.entidades.Filme;
import com.renanlopes.locadora.entidades.Locacao;
import com.renanlopes.locadora.entidades.Usuario;
import com.renanlopes.locadora.excecoes.FilmeSemEstoque;
import com.renanlopes.locadora.excecoes.LocacaoException;

public class LocacaoServiceTest {
	
	private LocacaoService service;
	
	private static int contador; 

	@Rule
	public ErrorCollector erros = new ErrorCollector();

	@Rule
	public ExpectedException excecao = ExpectedException.none();
	
	@BeforeClass
	public static void configurarClasse() {
		System.out.println("Before class...");
		contador = 0;
	}
	
	@Before 
	 public void configurar() {
		System.out.println("Before...");
		service = new LocacaoService();	
		System.out.println(++contador);
	}
	
	@AfterClass
	public static void finalizarClasse() {
		System.out.println("AfterClass...");
	}
	
	@After
	public void finalizar() {
		System.out.println("After...");
	}

	@Test
	public void testeLocacao() throws Exception {
		// Cenario		
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 1, 4.0);
		Usuario usuario = new Usuario("Luke Skywalker");

		System.out.println("Teste em execucao!");
		// Acao
		Locacao locacao = service.alugarFilme(usuario, filme);

		// Verificacao
		erros.checkThat(locacao.getValor(), is(equalTo(4.0)));
		erros.checkThat(locacao.getValor(), is(not(5.0)));
		erros.checkThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		erros.checkThat(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)), is(true));
	}

	@Test(expected = FilmeSemEstoque.class)
	public void testeLocacaoFilmeSemEstoque() throws Exception {
		// Cenario
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 0, 4.0);
		Usuario usuario = new Usuario("Luke Skywalker");

		// Acao
		service.alugarFilme(usuario, filme);
	}

	@Test
	public void testeLocacaoUsuarioVazio() throws FilmeSemEstoque {
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 0, 4.0);

		try {
			service.alugarFilme(null, filme);
			fail("Deveria lancar uma excecao para usuario vazio");
		} catch (LocacaoException e) {
			assertThat(e.getMessage(), is("Usuario vazio!"));
		}
	}

	@Test
	public void testeLocacaoFilmeVazio() throws LocacaoException, FilmeSemEstoque {
		// Cenario
		Usuario usuario = new Usuario("Luke Skywalker");

		//Configurando as excecoes esperadas no teste
		excecao.expect(LocacaoException.class);
		excecao.expectMessage("Filme Vazio");
		
		// Acao
		service.alugarFilme(usuario, null);
	}

}
