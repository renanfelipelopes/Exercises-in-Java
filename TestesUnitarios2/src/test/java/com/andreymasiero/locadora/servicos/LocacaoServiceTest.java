package com.andreymasiero.locadora.servicos;

import org.junit.Test;
import org.junit.Assert;

import com.andreymasiero.locadora.entidades.Filme;
import com.andreymasiero.locadora.entidades.Locacao;
import com.andreymasiero.locadora.entidades.Usuario;


public class LocacaoServiceTest {
	
	@Test
	public void testeFilme() {
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 10, 4.0);		
		Assert.assertNotNull(filme);
		Assert.assertEquals("Erro de comparação", 10, filme.getEstoque().intValue());		
	}
	
	@Test
	public void testeLocacao() {
		Filme filme = new Filme("Star Wars: O Império Contra-Ataca", 10, 4.0);	
		Usuario usuario = new Usuario("Luke Skywalker");
		LocacaoService service = new LocacaoService();
		Locacao locacao = service.alugarFilme(usuario, filme);
		Assert.assertNotNull(locacao);		
	}
	
}
