/* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em An√°lise e Desenvolvimento de Sistemas 
 * Polo: S„o Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.dominio;

public class Lance {
	
	private Usuario usuario;
	private double valor;
	
	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public double getValor() {
		return valor;
	}

}
