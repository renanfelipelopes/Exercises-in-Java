/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em Análise e Desenvolvimento de Sistemas 
* Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.locadora.servicos;

import static com.renanlopes.locadora.utils.DataUtils.adicionarDias;

import java.util.Date;

import com.renanlopes.locadora.entidades.Filme;
import com.renanlopes.locadora.entidades.Locacao;
import com.renanlopes.locadora.entidades.Usuario;
import com.renanlopes.locadora.excecoes.FilmeSemEstoque;
import com.renanlopes.locadora.excecoes.LocacaoException;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) throws LocacaoException, FilmeSemEstoque {
		if(usuario == null) throw new LocacaoException("Usuario vazio!");
		
		if(filme == null) throw new LocacaoException("Filme Vazio");
		
		if(filme.getEstoque() == 0) throw new FilmeSemEstoque();
		
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar mÃ©todo para salvar
		
		return locacao;
	}

	public static void main(String[] args) throws Exception {
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 10, 4.0);
		Usuario usuario = new Usuario("Luke Skywalker");
		LocacaoService service = new LocacaoService();
		Locacao locacao = service.alugarFilme(usuario, filme);
		if (locacao != null) System.out.println("Teste de locacao realizado com sucesso!");
		if (locacao.getFilme().getEstoque() > 0) System.out.println("Teste de filme para locacao com sucesso!");
	}
}