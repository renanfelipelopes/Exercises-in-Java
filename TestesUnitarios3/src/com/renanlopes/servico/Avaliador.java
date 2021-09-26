/* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em AnÃ¡lise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.servico;

import com.renanlopes.dominio.Lance;
import com.renanlopes.dominio.Leilao;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	
	public void avalia(Leilao leilao) {
		for(Lance lance : leilao.getLances()) {
			if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
			if(lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
		}
	}
	
	public double getMaiorLance() {
		return maiorDeTodos;
	}
	
	public double getMenorLance() {
		return menorDeTodos;
	}
}
