/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em An�lise e Desenvolvimento de Sistemas 
 * Polo: S�o Bernardo do Campo (Rudge Ramos)
 */

package com.renan.meiotransporte.modelos;

public class Navio extends MeioDeTransporte {
	
	int qtdPes;

	public Navio(int capacidade, String tipoCombustivel, int qtdPes) {
		super(capacidade, tipoCombustivel);		
		this.qtdPes = qtdPes;  
	}

	public int getQtdPes() {
		return qtdPes;
	}

	public void setQtdPes(int qtdPes) {
		this.qtdPes = qtdPes;
	}	
	
	@Override 
	public void locomover() {
		System.out.println("Navegando...");
	}
	
	public void navegar() {
		System.out.println("Em velocidade de cruzeiro...");
	}
	
	@Override 
	public String toString() {
		return "Capacidade: " + super.getCapacidade() + "\nCombustivel: " +
				super.getTipoCombustivel() + "\nP�s: " + this.getQtdPes();
	}
}
