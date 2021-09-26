/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
package maquinas;

    
public class Notebook extends Computador {
	
	public int qdtAltoFalantes = 0;
	public boolean possuiTouchPads = false;
	
	public Notebook(int velocidade, int quantidade, String fabricante) {
		super(velocidade, quantidade, fabricante);		
	}
	
	public Notebook(int velocidade, int quantidade, String fabricante, int qdtAltoFalantes, boolean possuiTouchPads) {
		super(velocidade, quantidade, fabricante);		
		this.qdtAltoFalantes = qdtAltoFalantes;
		this.possuiTouchPads = possuiTouchPads;
	}
	
	public int getAltoFalantes() {
		return qdtAltoFalantes;
	}
	
	public boolean getPossuiTouchPads() {
		return possuiTouchPads;
	}
	
	public String informacoesCompletas() {
		return "Sou um Notebook. Meu processador " + super.getFabricanteProcessador() + 
				" trabalha a uma velocidade de " + super.getVelocidadeProcessador() +
				". Possuo " + super.getQuantidadeMemoria() + "Mb de memoria. Tenho um total de " +
				qdtAltoFalantes + " alto falantes.";				
	}
	

}

