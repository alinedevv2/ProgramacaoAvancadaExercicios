/* Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder aumentos salariais a seus funcionários. Aqueles com salário superior a R$ 500,
terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão aumento de 7%. Os demais funcionários terão aumento de apenas 5%. Escreva um programa
que receba como entrada o salário atual de um funcionário, calcule e exiba o valor
de seu novo salário já com o aumento concedido. 
Entrada
Você receberá um único número com dupla precisão (double).
Saída
Você deve imprimir o número também com dupla precisão com resultado do
processamento.*/

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o salário do funcionário: ");
    double sal = input.nextInt();
        if (sal > 300 && sal < 500){
            sal = sal + (sal * 7/100);
        } else if ( sal > 500 ) {
            sal = sal + (sal * 10/100);
        } else {
            sal = sal + (sal * 5/100);
        }
        System.out.printf("%.2f",sal);
        input.close();
    }

}
