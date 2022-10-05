/*Um posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um programa para ler o tipo de combustível
abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel) e a
quantidade de litros anotados em 5 abastecimentos realizados.
Entrada
A entrada contém um valor inteiro referente ao tipo do combustível e um outro real
(float) contendo a quantidade de litros.
Saída
Deve ser escrito a quantidade de clientes que abasteceram cada tipo de combustível
com a respectiva quantidade de litros, conforme exemplo. */

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			tipo = input.nextInt();
			while (tipo < 1 || tipo > 4) {
				tipo = input.nextInt();
			}
			switch (tipo) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
        input.close();
    }
    
}
