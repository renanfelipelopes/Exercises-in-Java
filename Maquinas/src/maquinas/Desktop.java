/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
package maquinas;

public class Desktop extends Computador{
	
	public String corGabinete;
	public int potenciaFonteEnergia;
	
	public Desktop (int velocidade, int quantidade, String fabricante) {
		super(velocidade, quantidade, fabricante);		
	}	
	
	public Desktop (int velocidade, int quantidade, String fabricante, int potenciaFonteEnergia, String corGabinete) {
		super(velocidade, quantidade, fabricante);
                this.corGabinete = corGabinete;
                this.potenciaFonteEnergia = potenciaFonteEnergia;
	}
               
	public String getCorGabinete() {
		return corGabinete;
	}	
	
	public int getPonteciaFonteEnergia() {
		return potenciaFonteEnergia;
	}
	
	public String informacoesCompletas() {
		return "Sou um Desktop. Meu processador " + super.getFabricanteProcessador() + 
				" trabalha a uma velocidade de " + super.getVelocidadeProcessador() + 
				". Possuo " + super.getQuantidadeMemoria() + "Mb de memoria. Meu gabinet é de cor " +
				corGabinete + ".";
	}
	
			
}