/*Construa um programa para determinar se o indivíduo está com um peso
favorável ou não. Essa situação é determinada através do IMC (Índice de Massa
Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado
da Altura (ALTURA) do indivíduo. Ou seja, IMC = PESO / (ALTURA*ALTURA) e, a
situação do peso é determinada pela tabela abaixo:
IMC abaixo de 20 - Abaixo do peso
IMC de 20 até 25 - Peso Normal
IMC de 25 até 30 - Sobrepeso
IMC de 30 até 40 - Obeso
IMC acima de 40 - Obeso Mórbido 

Entrada
Receber o peso (float) e a altura (float).
Saída
Imprimir o IMC e a situação do paciente conforme tabela.*/

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float P = input.nextFloat();
        float A = input.nextFloat();
        
        float IMC = (P/(A*A));

        if (IMC < 20){
            System.out.println(IMC+" - Abaixo do peso");
        } else if ((IMC > 20 || IMC == 20) && (IMC < 25 || IMC == 25)){
            System.out.println(IMC+" - Peso Normal");
        } else if ((IMC > 25 || IMC == 25) && (IMC < 30 || IMC == 30)){
            System.out.println(IMC+" - Sobrepeso");
        } else if ((IMC > 30 || IMC == 30) && (IMC < 40 || IMC == 40)){
            System.out.println(IMC+" - Obeso");
        } else if (IMC > 40){
            System.out.println(IMC+" - Obeso Mórbido");
        }

        input.close();
    }
}
