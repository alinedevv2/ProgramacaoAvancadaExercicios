/*Escreva os 20 primeiros termos da série: 1, 3, 9, 27, ...
Entrada
Este programa não tem nenhuma entrada.
Saída
Deverá ser exibido a sequência completa contendo 20 termos. */

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        
        for (int i=0; i<20;i++) {
        System.out.println(num);
        num = num * 3;
        }
        input.close();
    }
}
