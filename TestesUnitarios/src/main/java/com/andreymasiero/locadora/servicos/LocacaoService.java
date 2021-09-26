package com.andreymasiero.locadora.servicos;

import static com.andreymasiero.locadora.utils.DataUtils.adicionarDias;

import java.util.Date;

import com.andreymasiero.locadora.entidades.Filme;
import com.andreymasiero.locadora.entidades.Locacao;
import com.andreymasiero.locadora.entidades.Usuario;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
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

	public static void main(String[] args) {
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 10, 4.0);
		Usuario usuario = new Usuario("Luke Skywalker");
		LocacaoService service = new LocacaoService();
		Locacao locacao = service.alugarFilme(usuario, filme);
		if (locacao != null) System.out.println("Teste de locacao realizado com sucesso!");
		if (locacao.getFilme().getEstoque() > 0) System.out.println("Teste de filme para locacao com sucesso!");
	}
}