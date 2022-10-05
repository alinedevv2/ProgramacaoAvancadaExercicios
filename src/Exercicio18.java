/* Faça um programa que inverta um número inteiro com quatro algarismos.
 * Entrada
Você receberá um único número inteiro com quatro algarismos.
Saída
Você deve imprimir o número invertido seguido de um final de linha. Importante: se o
número dado for 3000 por exemplo, o invertido dele deve ser 3 e não 0003.
 */

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int numeroInvertido = 0;

        while (N > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (N % 10);
            N = N / 10;
		}
		System.out.println(numeroInvertido);
        input.close();
    }
    
}
