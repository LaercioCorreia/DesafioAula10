/*
1 - Faça um programa para ler um vetor com valor indeterminado. Após isto, 
ler mais um número qualquer, calcular (soma) e escrever quantas vezes esse número 
aparece no vetor. Sempre imprimir na tela os processos do vetor.
 */
package Aula10;


import java.util.Scanner;
import java.util.ArrayList;
public class Exer1 {


  public static void main(String[] args) {
        
            int n, quantidade=0, soma=0;
            
          
            Scanner ler = new Scanner(System.in); 
            ArrayList<Integer>listagem = new ArrayList <>();
 
            
            
  do{
    System.out.println("Qual quantidade de números que serão digitadas?");
    quantidade = ler.nextInt();
    
    System.out.println("Digite os números :");
    n = ler.nextInt();
   
   
}while( n > 0);
  
       
  for (int i = 0; i < quantidade; i++){
            listagem.add(n);
        }
        
  for (int numero : listagem){
                soma += numero;
                
         }
           System.out.println("A soma dos números digitados é " + soma);
           System.out.println("Quantidade no Array: " + listagem.size());
     
       }


}



