/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
package maquinas;

public class Computador {
    
        public int velocidadeProcessador;
	public int quantidadeMemoria;
	public String fabricanteProcessador;
	
	public Computador(int velocidade, int quantidade, String fabricante) {
		this.velocidadeProcessador = velocidade;
		this.quantidadeMemoria = quantidade;
		this.fabricanteProcessador = fabricante;
	}
        
	public int getVelocidadeProcessador() {
		return this.velocidadeProcessador;
	}
	
	public int getQuantidadeMemoria() {
		return this.quantidadeMemoria;
	}
	
	public String getFabricanteProcessador() {
		return this.fabricanteProcessador;
	}
	
	public String dizerInformacoes() {
		return "Sou um computador. Meu processador " + fabricanteProcessador + 
				" trabalha a uma velocidade de " + velocidadeProcessador + ". Possuo " +
				quantidadeMemoria + "Mb de memória.";
	}	
          
}
