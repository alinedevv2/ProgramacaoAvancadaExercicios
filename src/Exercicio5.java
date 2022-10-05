/*Faça um programa que leia do teclado três valores inteiros e exiba-os em ordem crescente. */

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valor = new int[3];
        int auxiliar;
   
        //Loop para leitura de três inteiros
        for (int i=0; i<3 ; i++){
        //Faz a leitura do número
        valor[i] = input.nextInt();
        }

        /*Bubble Sort*/

         for (int i = 0; i < valor.length - 1; i++){
            for (int j =0; j < valor.length - 1; j++){
                if (valor[j] > valor[j + 1]) {
                auxiliar = valor[j];
                valor[j] = valor[j+1];
                valor[j+1] = auxiliar;
                }
            }
         }

        System.out.println("Ordem crescente: " + Arrays.toString(valor));

        input.close();
    }
}
