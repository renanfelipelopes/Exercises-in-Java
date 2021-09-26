/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em Análise e Desenvolvimento de Sistemas 
* Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renanlopes.handson.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.renanlopes.handson.Interfaces.Filtro.Filtros;
import com.renanlopes.handson.Interfaces.Filtro.Impar;
import com.renanlopes.handson.Interfaces.Filtro.Par;
import com.renanlopes.handson.Interfaces.Filtro.Multiplos_3;
import com.renanlopes.handson.Interfaces.Filtro.Multiplos_5;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		for(int i = 1; i<= 30; i++) numeros.add(i);
		System.out.println("Números de 1 a 30:");
		System.out.println(Arrays.toString(numeros.toArray()));
		
		Filtros f = new Filtros();
		
		System.out.println("Números Impares: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Impar()).toArray()));	
		System.out.println("Números Pares: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Par()).toArray()));	
		System.out.println("-------------------------------------------------------------");
		System.out.println("Números Múltiplos de 3: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Multiplos_3()).toArray()));	
		System.out.println("Números Múltiplos de 5: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Multiplos_5()).toArray()));
	}

}
