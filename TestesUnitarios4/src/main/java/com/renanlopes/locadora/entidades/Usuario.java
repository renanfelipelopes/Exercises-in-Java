/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em An�lise e Desenvolvimento de Sistemas 
* Polo: S�o Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.locadora.entidades;

public class Usuario {

	private String nome;
	
	public Usuario() {}
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}