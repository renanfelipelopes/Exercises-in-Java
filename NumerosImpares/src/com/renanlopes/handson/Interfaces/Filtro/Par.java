package com.renanlopes.handson.Interfaces.Filtro;

public class Par implements Predicado {

	@Override
	public boolean avaliar(int numero) {
		return (numero % 2) == 0;
	}

}
