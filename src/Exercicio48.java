/*Elabore um programa que, a partir da idade e do peso de um paciente, lidas via teclado, calcule a dosagem de determinado medicamento e escreva a receita informando quantas gotas do medicamento o paciente deve tomar por dose.
Considere que o medicamento em questão possui 500 mg por ml, o que cada ml corresponde a 20 gotas.
● Adultos ou adolescentes desde 12 anos, Inclusive, se tiverem peso igual ou
acima dos 60 quilos devem tomar 1000 mg; com peso abaixo dos 60 quilos
devem tomar 875 mg.
● Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo
peso corpóreo conforme a tabela a seguir: 
5 a 9 kg - 125 mg
9.1 a 16 kg - 250 mg
16.1 a 24 kg - 375 mg
24.1 a 30 kg - 500 mg
Acima de 30 kg - 750 mg

Entrada
Receber a idade (int) e o peso (float).
Saída
Imprimir a receita informando quantas gotas do medicamento o paciente deve tomar
por dose.*/

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dosagem = 0;
        int idade = input.nextInt();
        float peso = input.nextInt();

        if (idade < 12) {
            if ((peso > 5 || peso == 5) && (peso < 9 || peso == 9)) {
                dosagem = 125;
            } else if ((peso > 9.1 || peso == 9.1) && (peso < 16 || peso == 16)) {
                dosagem = 250;
            } else if ((peso > 16.1 || peso == 16.1) && (peso < 24 || peso == 24)){
                dosagem = 375;
            } else if ((peso > 24.1 || peso == 24.1) && (peso < 30 || peso == 30)) {
                dosagem = 500;
            } else if (peso > 30) {
                dosagem = 750;
            }
        } else {
            if (peso > 60 || peso == 60){
                dosagem = 1000;
            } else if (peso < 60){
                dosagem = 875;
            }
        }
        System.out.println("dosagem: "+dosagem);
        int gotas = ((20*dosagem)/500);
        System.out.println(gotas+" gotas");
        input.close();
    }
}
