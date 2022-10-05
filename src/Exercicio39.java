import java.util.Scanner;

/*Elabore um programa que permita exibir na tela a tabuada de um número inteiro
informado via teclado.
Entrada
Será recebido um número inteiro positivo.
Saída
Será exibido uma tabuada de acordo com o formato abaixo. */

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que deseja gerar a tabuada:");
        int N = input.nextInt();

        for (int i=0; i<10;i++) {
            int mult = N * i;
            System.out.println(N+" x "+i+" = "+mult);
        }
        input.close();
    }
}
