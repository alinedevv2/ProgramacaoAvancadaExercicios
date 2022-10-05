/* Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
apenas pelo número 1 e pelo número 7.
Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um
inteiro N (1 < N <= 100), indicando o número de casos de teste da entrada. Cada
uma das N linhas seguintes contém um valor inteiro X (1 < X <= 107), que pode ser
ou não, um número primo.
Saída
Para cada caso de teste de entrada, imprima a mensagem “X é primo" ou “X não é
primo”, de acordo com a especificação fornecida. */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X, cont;
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	X = input.nextInt();
        	for (int j = 2; j < X; j++) {
        		if (X % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(X + " é primo");
        	else System.out.println(X + " não é primo");
        }
        input.close();
    }
}
