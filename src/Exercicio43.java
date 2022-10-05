/*Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos
gostarem de suas esfihas, ele só sabe dar o troco com duas notas, ou seja, nem
sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um
programa para ele que determine se é possível ou não devolver o troco exato
utilizando duas notas.
As notas disponíveis são: 2, 5, 10, 20, 50 e 100.
Entrada
A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, em
seguida, o valor inteiro M pago pelo cliente (N < M <= 1000).
Saída
Seu programa deverá imprimir "possível" se for possível devolver o troco exato ou
"impossível" se não for possível. */

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        	int N = input.nextInt();
        	int M = input.nextInt();
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possibilidade = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (troco - notas[j] == notas[i]) possibilidade = true;
    			}
    		}
    		
    		if (possibilidade) System.out.println("Possível");
    		else System.out.println("Impossível");
        }
        input.close();
    }
}
