/*
 
2 - Leia um vetor de 20 posições. Contar e escrever quantos valores pares e ímpares ele possui. 
Imprimir na tela
 */
package Aula10;

import java.util.Scanner;
import java.util.ArrayList;

public class exer2 {


    public static void main(String[] args) {
        
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
       

        int numero;
        
        Scanner ler = new Scanner (System.in);
        
        
        
        System.out.println("******IDENTIFICAÇÃO DE NÚMEROS ÍMPARES E PARES***********");

        //LENDO NÚMEROS DIGITADOS
        do {
            System.out.println("Digite um numero: ");
            numero = ler.nextInt();
            
       //GRAVANDO NA LISTA DE PARES
            if (numero%2 == 0){
                
                
                pares.add(numero);
               
       //GRAVANDO NA LISTA DE ÍMPARES
            }else{
            
                impares.add(numero);
                }
                    
         }while (numero>0);
        
         
        // NÃO EXISTINDO NÚMEROS PARES DIGITADOS
        if(pares.size() > 0){
            
         System.out.println(pares);
        
            
         }
          
        //MOSTRANDO NÚMEROS PARES DIGITADOS
       
        //NÃO EXISTINDO NÚMEROS ÍMPARES DIGITADOS
        if(impares.isEmpty()){
            System.out.println("A lista de ímpares está vazia");
        
        //MOSTRANDO NÚMEROS ÍMPARES DIGITADOS
        }else{
         
         System.out.println("A lista de ímpares é: " + impares);
         
    }
                
        
        if(pares.isEmpty()){
            System.out.println("A lista de pares está vazia");
    
    }else{
            System.out.println("A lista de pares é: " + pares); 
        }
        
        
    } 
}



