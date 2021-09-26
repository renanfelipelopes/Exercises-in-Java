/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
package calculadora;

/**
 * @author renan
 */

public class ClasseCalculadora {
   public String cor;
   public int capacidadeDeDigitosDoVisor;
   public float peso;
 
   
   public int retornarSomaDeDoisNumeros(int numero1, int numero2){
       int resultado;
       resultado = numero1 + numero2;
       return resultado;
   }
   
   public int fatorial(int numero1) {
       if(numero1 == 0){
       return 1;
   }
       int total = 1;
       for (int i=numero1; i>1; i--){
           total *= i;
       }      
       return total;       
   }    
   
   public int resto(int numero1, int numero2){
       int resultado;
       resultado = numero1 % numero2;
       return resultado;
   }
   
   public double peso(double numero1, double numero2){
       double resultado, altura; 
       altura = numero2 / 100;
       resultado = numero1 / Math.pow(altura, 2);
       return resultado;
   }
   
}
