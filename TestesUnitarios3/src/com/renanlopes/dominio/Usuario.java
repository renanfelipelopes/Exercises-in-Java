/* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em An√°lise e Desenvolvimento de Sistemas 
 * Polo: S„o Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.dominio;

public class Usuario {
	
	private int id;
	private String nome;
	
	public Usuario(String nome) {
		this(0, nome);
	}
	
	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
}
