/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade de uma pessoa em dias:");
        int idade = input.nextInt();
        int anos, meses, dias = 0;

        anos = idade/365;
        meses = (idade % 365)/30;
        dias = (idade % 365)%30;

        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mês(es)");
        System.out.println(dias+" dia(s)");
        input.close();
    }
}
