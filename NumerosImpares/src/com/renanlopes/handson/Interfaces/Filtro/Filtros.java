package com.renanlopes.handson.Interfaces.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Filtros {

		public List<Integer> filtrar(List<Integer> numeros, Predicado predicado){
			List<Integer> filtrados = new ArrayList<>();
			for(int numero : numeros) {
				if(predicado.avaliar(numero)) {
					filtrados.add(numero);
				}
			}
			return filtrados; 
		}
}
