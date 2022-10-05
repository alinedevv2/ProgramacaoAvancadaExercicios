/*Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double a = input.nextDouble();
        double b = input.nextDouble();
        double SALARIO = (a+0.15*b);

        System.out.printf("TOTAL do funcionário"+nome+" = R$%.2f", SALARIO);
        input.close();
    }
}
