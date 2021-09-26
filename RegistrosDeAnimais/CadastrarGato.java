import java.util.Scanner;

public class CadastrarGato {

	void cadastroGato(Scanner s) {		
		
		Gato gato = new Gato();
		
		Venda venda = new Venda();
		
		System.out.print("Informe o nome do gato: ");		
		gato.nome = s.next();
		
		System.out.print("Informe a ra�a do gato: ");	
		gato.raca = s.next();
		
		System.out.print("Informe o peso do gato: ");	
		gato.peso = s.nextDouble();
		
		System.out.print("Informe a idade do gato: ");	
		gato.idade = s.nextInt();
		
		System.out.print("Informe o pre�o do gato: ");	
		gato.preco = s.nextDouble();
		
		System.out.print("Informe o valor: ");
		venda.valor = s.nextDouble();		
		
		gato.arranhar();
		gato.comer();
		gato.pulando();
		
		System.out.format("O %s da ra�a %s pesa %.1f kg e est� na idade de %d anos.\nSeu valor de mercado " 
				+ "� de R$ %.2f.\n\n", gato.nome, gato.raca, gato.peso, 
				gato.idade, gato.preco);
		
	}
	
}
