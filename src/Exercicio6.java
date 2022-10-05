/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em km) e o total de combustível gasto (em litros).*/

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        double Y = input.nextInt();
        double Z = (X/Y);
        
        System.out.printf("%.3f", Z, " km/l");

        input.close();
    }
}