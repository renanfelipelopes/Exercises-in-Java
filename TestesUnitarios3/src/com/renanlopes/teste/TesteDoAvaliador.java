/* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em An√°lise e Desenvolvimento de Sistemas 
 * Polo: S„o Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.teste;

import org.junit.Test;

import com.renanlopes.dominio.Lance;
import com.renanlopes.dominio.Leilao;
import com.renanlopes.dominio.Usuario;
import com.renanlopes.servico.Avaliador;

import junit.framework.Assert;

public class TesteDoAvaliador {

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 3 Novo");
		
		leilao.propoe(new Lance(joao, 250.00));
		leilao.propoe(new Lance(jose, 300.00));
		leilao.propoe(new Lance(maria, 400.00));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400;
		double menorEsperado = 250;
		
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
	}
}
