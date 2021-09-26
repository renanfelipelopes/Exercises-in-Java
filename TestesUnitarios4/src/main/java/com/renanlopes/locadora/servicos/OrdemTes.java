/* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Analise e Desenvolvimento de Sistemas 
 * Polo: Sao Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.locadora.servicos;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdemTes {
	
	private static int contador;

	@Test
	public void inicia() {
		contador = 1;
	}
	
	@Test
	public void verifica() {
		assertThat(contador, CoreMatchers.is(1));
	}
	
	
	
}
