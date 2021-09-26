import java.util.Scanner;

public class CadastrarCachorro {
	
	void cadastroCao(Scanner s) {		
				
		Cachorro cachorro = new Cachorro();
		
		Venda venda = new Venda();
		
		System.out.print("Informe o nome do cachorro: ");		
		cachorro.nome = s.next();
		
		System.out.print("Informe a raça do cachorro: ");	
		cachorro.raca = s.next();
		
		System.out.print("Informe o peso do cachorro: ");	
		cachorro.peso = s.nextDouble();
		
		System.out.print("Informe a idade do cachorro: ");	
		cachorro.idade = s.nextInt();
		
		System.out.print("Informe o valor: ");
		venda.valor = s.nextDouble();		
		
		cachorro.latir();
		cachorro.morder();
		cachorro.correr();
		
		System.out.format("O %s da raça %s pesa %.1f kg e está na idade de %d anos.\nSeu valor de mercado " 
				+ "é de R$ %.2f.\n\n", cachorro.nome, cachorro.raca, cachorro.peso, 
				cachorro.idade, venda.valor);
		
	}

}
