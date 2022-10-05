/*Faça um programa que leia do teclado três valores inteiros e exiba o maior e menor entre eles.*/

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int valor;
    int maior = 0;
    int menor = 0;
   
    //Loop para leitura de três inteiros
    for (int i=0; i<3 ; i=i+1){
        //Faz a leitura do número
        valor = input.nextInt();
        
        if(i==0){
            maior = valor;
            menor = valor;
        }
        if(valor>maior){
            maior = valor;
        }
        if(valor<menor){
            menor = valor;
        }
    }

    System.out.println("MAIOR: = " + maior);
    System.out.println("MENOR: = " + menor);

    input.close();
    }
}