import java.util.Scanner;

public class CadastrarPassaro {

	void cadastroPassaro(Scanner s) {		
		
		Passaro passaro = new Passaro();
		
		Venda venda = new Venda();
		
		System.out.print("Informe o nome do passaro: ");		
		passaro.nome = s.next();
		
		System.out.print("Informe a espécie do passaro: ");	
		passaro.especie = s.next();
		
		System.out.print("Informe o sexo do passaro: ");	
		passaro.sexo = s.next();
		
		System.out.print("Informe a idade do passaro: ");	
		passaro.idade = s.nextInt();
		
		System.out.print("Informe o preço do passaro: ");	
		passaro.preco = s.nextDouble();
		
		System.out.print("Informe o valor: ");
		venda.valor = s.nextDouble();
				
		passaro.cantar();
		passaro.voar();
		passaro.comer();
		
		System.out.format("O passaro com nome de %s da espécie %s é do sexo %s e está na idade de %d anos.\nSeu valor de mercado " 
				+ "é de R$ %.2f.\n\n", passaro.nome, passaro.especie, passaro.sexo, 
				passaro.idade, passaro.preco);
		
	}
	
}
