/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em An�lise e Desenvolvimento de Sistemas 
* Polo: S�o Bernardo do Campo (Rudge Ramos)
 */


package com.renanlopes.veiculo;

public class Veiculo {

	public int qtdRodas;
	public String combustivel;
	
	public Veiculo (int qtdRodas, String combustivel) {
		this.qtdRodas	 = qtdRodas;
		this.combustivel = combustivel;
	}
	
	public int getQtdRodas() {
		return qtdRodas;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public String dizerInformacoes() {
		return "Quantidade de rodas: " + getQtdRodas() +
				".\n" + 
				"Tipo de comb�stivel: " + getCombustivel() + ".";
	}
}
