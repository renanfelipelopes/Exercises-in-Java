package com.renanlopes.handson.excecao;

public class Principal {

	public static void metodo2() {
		System.out.println("Iniciando um metodo 2...");
		//try {
			int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			for(int i = 0; i < 10; i++) System.out.println(v[i]);
		//} catch(ArrayIndexOutOfBoundsException ex) {
		//	ex.printStackTrace();
		//}		
		System.out.println("Finalizando um metodo 2...");		
	}
	
	public static void metodo1() {
		System.out.println("Iniciando um metodo 1...");
		metodo2(); 
		System.out.println("Finalizando um metodo 1...");		
	}
	
	public static void main(String[] args) {	
		System.out.println("Iniciando um metodo main..."); 
		metodo1(); 
		System.out.println("Finalizando um metodo main...");
	}

}
