/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em An�lise e Desenvolvimento de Sistemas 
* Polo: S�o Bernardo do Campo (Rudge Ramos)
 */


package com.renanlopes.veiculo;

public class Comodidade extends Veiculo{

	int qtdPortas;
	int qtdAssentos;
	
	public Comodidade(int qtdRodas, String combustivel) {
		super(qtdRodas, combustivel);
		
		this.qtdPortas 	 = 0;
		this.qtdAssentos = 0;
	}
	
	public Comodidade(int qtdRodas, String combustivel, int portas, int assentos) {
		super(qtdRodas, combustivel);
		
		this.qtdPortas = portas;
		this.qtdAssentos = assentos;
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}
	
	public int getQtdAssentos() {
		return qtdAssentos;
	}
	
	public String InformacoesCompletas() {
		return "Seu ve�culo possui " + getQtdPortas() + " portas.\n" + 
				"A quantidade de assentos para o conforto de sua fam�lia � de " + 
				getQtdAssentos() + " lugares.";
	}
	
}
