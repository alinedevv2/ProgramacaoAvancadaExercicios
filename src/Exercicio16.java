/*Supondo que a população de um país A seja recebido via teclado em uma variável com dupla precisão (double) representando a população atual daquele país que possui uma taxa anual de crescimento de 3% a.a. o que a população de um
país B seja recebida também em uma variável com dupla precisão e que tenha uma taxa anual de crescimento de 1,5% a.a., fazer um programa que calcule e de anos necessários para que a população do país A ultrapasse ou iguale a população do
número do país B, mantida essas taxas de crescimento. */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double POPA = input.nextDouble();
        double POPB = input.nextDouble();
        int anos = 0;

        while (POPA < POPB){
            POPA = POPA*(POPA*3/100);
            POPB = POPB*(POPB*1.5/100);
            anos++;
        }
        System.out.println(anos+" anos");
        input.close();
    }   
}
