/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double c = input.nextDouble();

        double SALARIO = (b*c);
        System.out.printf("NÚMERO = " + a);
        System.out.printf(" SALÁRIO = %.2f", SALARIO);

        input.close();
    }
}