package com.renanlopes.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em An√°lise e Desenvolvimento de Sistemas 
 * Polo: S„o Bernardo do Campo (Rudge Ramos)
 */

public class Leilao {

	private String descricao;
	private List<Lance> lances;
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		lances.add(lance);
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public List<Lance> getLances(){
		return Collections.unmodifiableList(lances);
	}
}
