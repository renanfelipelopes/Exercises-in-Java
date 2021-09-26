/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renan.meiotransporte.modelos;

public class Carro extends MeioDeTransporte {
	
	private int qtdRodas;

	public Carro (int capacidade, String tipoCombustivel) {
		super(capacidade, tipoCombustivel);
	}
	
	public Carro (int capacidade, String tipoCombustivel, int qtdRodas) {
		super(capacidade, tipoCombustivel);
		this.qtdRodas = qtdRodas;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	@Override 
	public void locomover() {
		System.out.println("Rodando...");
	}
	
	@Override 
	public String toString() {
		return "Capacidade: " + super.getCapacidade() + "\nCombustivel: " +
				super.getTipoCombustivel() + "\nRodas: " + this.qtdRodas;
	}
		
}
