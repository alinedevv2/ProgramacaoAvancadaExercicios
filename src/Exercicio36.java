/*Papai Noel está brincando com seus duendes para entretê-los durante a véspera do Natal. A brincadeira consiste nos elfos escreverem números em pedaços de
papel e colocarem no gorro do Papai Noel. Após todos terminarem de colocar os 20 números, Noel sorteia um papel e aquele número representa quantos "HO" o Noel
deve falar. Seu trabalho é ajudar o Papai Noel montando um problema que mostre todos os "HO" que ele deve falar dado o número sorteado. 
Entrada
A entrada é composta por um único inteiro N (1< N <= 10) representando quantos
"HO" serão falados por Noel.
Saída
A saída é composta por todos "HO" que Papai Noel deve falar separados por um
espaço. Após o último "HO" deve ser apresentado um "!” encerrando o programa.*/

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println("HO!");
        	else System.out.print("HO ");
        }
        input.close();
    }
}
