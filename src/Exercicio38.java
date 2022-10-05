/*Elabore um programa que permita receber um número inteiro via teclado e
imprimir se o número recebido é primo ou não. Sabe-se que um número é primo
quando é apenas divisível por 1 e por ele mesmo.
Entrada
Será recebido um número inteiro positivo
Saída
Para cada caso de teste, imprima “É PRIMO” ou “NÃO É PRIMO”. */

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int cont = 0;
        for (int j = 2; j < N; j++) {
            if (N % j == 0) cont++;
        }
        if (cont == 0) System.out.println(N + " É PRIMO");
        	else System.out.println(N + " NÃO É PRIMO");
        input.close();
    }
}
