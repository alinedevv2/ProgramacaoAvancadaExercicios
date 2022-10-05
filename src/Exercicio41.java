/*Elabore um programa que permita receber o peso (double) e a altura (double) de
uma pessoa adulta. O programa deverá exibir uma das seguintes mensagens:
“Parabéns peso ideal”, “Engorde X Kg” ou “Emagreça X Kg” de acordo com a
tabela abaixo:
Até 1.50 - 50 kg
De 1.51 até 1.90 - 70 kg
Acima de 1.91 - 100 kg 
Entrada
Serão recebidos dois valores com dupla precisão (double) referente ao PESO e a
ALTURA.
Saída
Será informado uma das mensagens: “Parabéns peso ideal!”, “Engorde X kg" ou
Emagreça X kg*/

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        double P = input.nextDouble();
        System.out.print("Digite a altura: ");
        double A = input.nextDouble();
        double PI = 0; //Peso ideal
        double PA = 0; //Peso a alterar

        if (A < 1.50) {
            PI = 50;
        } else if (A > 1.51 && A < 1.90) {
            PI = 70;
        } else {
            PI = 100;
        }

        if (P < PI) {
            PA = PI - P;
            System.out.printf("Engorde %.2f",PA,"kg");
        } else if (P > PI){
            PA = P - PI;
            System.out.printf("Emagreça %.2f",PA,"kg");
        } else {
            System.out.printf("Parabéns peso ideal!");
        }
        input.close();
    }
}
