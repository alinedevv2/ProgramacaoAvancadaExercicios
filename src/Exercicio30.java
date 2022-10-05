/*Leia um conjunto 3 (três) pares de valores M e N. Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).
Entrada
O arquivo de entrada contém 3 (três) pares de valores M e N.
Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma
deles, conforme exemplo abaixo. */

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int M = input.nextInt();
    	int N = input.nextInt();
    	int soma=0;
    	while (M > 0 && N > 0) {
    		
    		if (M > N) {
        		for (int i = N; i <= M; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		} else {
        		for (int i = M; i <= N; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		}

    		System.out.println("Soma = " + soma);
        	M = input.nextInt();
        	N = input.nextInt();
        	soma = 0;
    	}
        input.close();
    }
}
