import java.util.Scanner;

public class CadastrarPeixe {
	
	void cadastroPeixe(Scanner s) {		
		
		Peixe peixe = new Peixe();
		
		Venda venda = new Venda();
		
		System.out.print("Informe o nome popular da especie: ");		
		peixe.nomePopular = s.next();
		
		System.out.print("Informe o tipo de alimentação: ");	
		peixe.alimentacao = s.next();
		
		System.out.print("Informe a preferência por acidez da água em pH: ");	
		peixe.ph = s.nextDouble();		
		
		System.out.print("Informe o valor do peixe: ");	
		peixe.preco = s.nextDouble();
		
		System.out.print("Informe o valor: ");
		venda.valor = s.nextDouble();
		
		peixe.comer();
		peixe.procriar();
		peixe.nadar();
		
		System.out.format("O peixe conhecido popularmente como %s se alimenta de %s e tem preferencia por pH de água de %.1f"
				+ "\nSeu valor de mercado " 
				+ "é de R$ %.2f.\n\n", peixe.nomePopular, peixe.alimentacao, peixe.ph, 
				peixe.preco);
	}

}
