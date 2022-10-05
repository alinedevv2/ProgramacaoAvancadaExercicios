/*Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o programa só aceita notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
Entrada
A entrada contém vários valores reais, positivos ou negativos.
Saída
Se uma nota inválida for lida deve ser impressa a mensagem “NOTA INVÁLIDA”.
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "MÉDIA = "
seguido do valor do cálculo. */

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("NOTA INVÁLIDA");
			nota1 = input.nextDouble();
		}
		
		double nota2 = input.nextDouble();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("NOTA INVÁLIDA");
			nota2 = input.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		System.out.println(String.format("MÉDIA = %.2f", media));
        input.close();
    }
    
}
