/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em An�lise e Desenvolvimento de Sistemas 
* Polo: S�o Bernardo do Campo (Rudge Ramos)
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
		System.out.println("N�meros de 1 a 30:");
		System.out.println(Arrays.toString(numeros.toArray()));
		
		Filtros f = new Filtros();
		
		System.out.println("N�meros Impares: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Impar()).toArray()));	
		System.out.println("N�meros Pares: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Par()).toArray()));	
		System.out.println("-------------------------------------------------------------");
		System.out.println("N�meros M�ltiplos de 3: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Multiplos_3()).toArray()));	
		System.out.println("N�meros M�ltiplos de 5: ");
		System.out.println(Arrays.toString(f.filtrar(numeros, new Multiplos_5()).toArray()));
	}

}
