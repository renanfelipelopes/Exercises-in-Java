/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renan.meiotransporte.modelos;

public abstract class MeioDeTransporte {
	private int capacidade;
	private String tipoCombustivel;
	
	public MeioDeTransporte(int capacidade, String tipoCombustivel) {
		this.capacidade = capacidade;
		this.setTipoCombustivel(tipoCombustivel);
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade; 
	}

	public String getTipoCombustivel() {
		return this.tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
		
	public abstract void locomover();
	
}
