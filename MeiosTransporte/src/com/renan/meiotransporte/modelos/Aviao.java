/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renan.meiotransporte.modelos;

public class Aviao extends MeioDeTransporte{

	private int qtdTurbinas;
	
	public Aviao(int capacidade, String tipoCombustivel, int qtdTurbinas) {
		super(capacidade, tipoCombustivel);
		this.setQtdTurbinas(qtdTurbinas);
	}	
	
	public int getQtdTurbinas() {
		return qtdTurbinas;
	}

	public void setQtdTurbinas(int qtdTurbinas) {
		this.qtdTurbinas = qtdTurbinas;
	}
	
	@Override 
	public void locomover() {
		System.out.println("Voando...");
	}
	
	public void decolar() {
		System.out.println("Decolando...");
	}
	
	@Override 
	public String toString() {
		return "Capacidade: " + super.getCapacidade() + "\nCombustivel: " +
				super.getTipoCombustivel() + "\nTurbinas: " + this.qtdTurbinas;
	}
}
