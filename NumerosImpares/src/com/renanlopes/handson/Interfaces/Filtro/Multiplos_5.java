package com.renanlopes.handson.Interfaces.Filtro;

public class Multiplos_5 implements Predicado {
	
	@Override
	public boolean avaliar(int numero) {
		return (numero % 5) == 0;
	}
	
}
