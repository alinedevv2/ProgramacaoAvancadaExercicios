/*Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso. */

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int contador = 0;

        while (contador<6){
            if ( X % 2 == 1){
                System.out.println(X);
                contador++;
            }
            X++;
        }
        input.close();
    }

}
