/* A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
primeiros números dessa série. */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println(anterior);
        	else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual;
        	atual = proximo;
        }
        input.close();
    }
}
