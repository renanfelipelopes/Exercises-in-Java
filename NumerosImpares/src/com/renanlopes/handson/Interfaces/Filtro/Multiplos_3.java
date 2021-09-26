package com.renanlopes.handson.Interfaces.Filtro;

public class Multiplos_3 implements Predicado{

	@Override
	public boolean avaliar(int numero) {
		return (numero % 3) == 0;
	}
	
}
