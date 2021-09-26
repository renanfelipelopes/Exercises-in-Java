/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em Análise e Desenvolvimento de Sistemas 
* Polo: São Bernardo do Campo (Rudge Ramos)
 */


package com.renanlopes.veiculo;

public class Tecnologia extends Veiculo{

	public String sistemaTransmissao;
	public String tipoDeFreio;
	
	public Tecnologia(int qtdRodas, String combustivel) {
		super(qtdRodas, combustivel);
		
		this.sistemaTransmissao = "";
		this.tipoDeFreio 		= "";
	}
	
	public Tecnologia(int qtdRodas, String combustivel, String transmissao, String freio) {
		super(qtdRodas, combustivel);
		
		this.sistemaTransmissao = transmissao;
		this.tipoDeFreio 		= freio;
	}
	
	public String getSistemaTransmissao() {
		return sistemaTransmissao;
	}
	
	public String getTipoDeFreio() {
		return tipoDeFreio;
	}
	
	public String InformacoesCompletas() {
		return "Seu veículo possui um sistema de trasmissão " + String.valueOf(getSistemaTransmissao()) +
				".\n" + 
				"O sistema de frenagem é " + String.valueOf(getTipoDeFreio()) +
				".";
	}
	
}
