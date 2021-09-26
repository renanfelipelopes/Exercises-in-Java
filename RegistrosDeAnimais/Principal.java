import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		CadastrarCachorro cadastrar = new CadastrarCachorro();		
		for(int i = 0; i < 11; i++) {
			cadastrar.cadastroCao(s);		
		}		
		
		CadastrarGato cadastrarGato = new CadastrarGato();
		for (int i = 0; i < 11; i++) {
			cadastrarGato.cadastroGato(s);
		}
		
		CadastrarPassaro cadastrarPassaro = new CadastrarPassaro();
		for (int i = 0; i < 11; i++) {
			cadastrarPassaro.cadastroPassaro(s);
		}
		
		CadastrarPeixe cadastrarPeixe = new CadastrarPeixe();
		for (int i = 0; i < 11; i++) {
			cadastrarPeixe.cadastroPeixe(s);
		}
		
		
		
	}

}
