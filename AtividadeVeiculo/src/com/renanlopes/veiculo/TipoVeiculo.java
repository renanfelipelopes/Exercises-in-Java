/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em Análise e Desenvolvimento de Sistemas 
* Polo: São Bernardo do Campo (Rudge Ramos)
 */


package com.renanlopes.veiculo;

public class TipoVeiculo extends Veiculo{
	
	public String marca;
	public String tipoCarroceria;
	
	public TipoVeiculo (int qtdRodas, String combustivel) {
		super(qtdRodas, combustivel);
		
		this.marca = "";
		this.tipoCarroceria = "";		
	}
	
	public TipoVeiculo (int qtdRodas, String combustivel, String fabrica, String TipoCarroceria) {
		super(qtdRodas, combustivel);
		
		this.marca = fabrica;
		this.tipoCarroceria = TipoCarroceria;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}
	
	public String InformacoesCompletas() {
		return "Seu veículo da marca " + String.valueOf(getMarca()) + 
				" tem a carroceria do tipo " + String.valueOf(getTipoCarroceria()) + ".";				
	}
}
