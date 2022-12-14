/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.*/

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
        float valor = N;

        notas100= (int) (valor/100);
        valor %= 100;
        notas50 = (int) (valor / 50);
        valor %= 50;
        notas20 = (int) (valor / 20);
        valor %= 20;
        notas10 = (int) (valor / 10);
        valor %= 10;
        notas5 = (int) (valor / 5);
        valor %= 5;
        notas2 = (int) (valor / 2);
        valor %= 2;
        notas1 = (int) (valor / 1);
        valor %= 1;

        System.out.println(N);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
        input.close();
    }

}
