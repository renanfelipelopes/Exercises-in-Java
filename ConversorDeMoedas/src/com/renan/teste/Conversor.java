package com.renan.teste;

import com.renan.conversorEJB.conversorRemote;
import com.renan.services.ServiceLocator;
import java.util.Scanner;


public class Conversor {
    
    public static void main(String[] args) throws Exception{
        
        conversorRemote ejb = ServiceLocator.buscaEJB(conversorRemote.class);
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe o valor: ");
        
        double resultado = 0.0;
        double valor = sc.nextDouble();
        
        System.out.println("Informe o numero da conversão desejada: ");
        System.out.println("1 - Dolar para Real");
        System.out.println("2 - Dolar para Euro");
        System.out.println("3 - Dolar para Dolar");
        System.out.println("4 - Euro para Dolar");
        System.out.println("5 - Euro para Real");
        System.out.println("6 - Euro para Euro");
        System.out.println("7 - Real para Dolar");
        System.out.println("8 - Real para Euro");
        System.out.println("9 - Real para Real");
        
        int opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                resultado = ejb.dolarParaReal(valor);
                System.out.println(valor + "Dolares corresponde a: " + resultado + " Reais"); 
            break;
            
            case 2:
                resultado = ejb.dolarParaEuro(valor);
                System.out.println(valor + "Dolares corresponde a: " + resultado + " Euros"); 
            break;
            
            case 3:
                System.out.println(valor + "Dolares corresponde a: " + resultado + " Dolares"); 
            break;
            
            case 4:
                resultado = ejb.euroParaDolar(valor);
                System.out.println(valor + "Euros corresponde a: " + resultado + " Dolares"); 
            break;
            
            case 5:
                resultado = ejb.euroParaReal(valor);
                System.out.println(valor + "Euros corresponde a: " + resultado + " Reais"); 
            break;
            
            case 6:
                System.out.println(valor + "Euros corresponde a: " + resultado + " Euros"); 
            break;
            
            case 7:
                resultado = ejb.realParaDolar(valor);
                System.out.println(valor + "Reais corresponde a: " + resultado + " Dolares"); 
            break;
            
            case 8:
                resultado = ejb.realParaEuro(valor);
                System.out.println(valor + "Reais corresponde a: " + resultado + " Euros"); 
            break;
            
            case 9:
                System.out.println(valor + "Reais corresponde a: " + resultado + " Reais"); 
            break;
        }
        
    }
}
