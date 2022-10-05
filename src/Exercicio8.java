/*Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo: */

/*Renda Conjunta Alíquota - IR
Até 900.00 - Isento
De 900.01 até 1500.00 - 10%
De 1500.01 até 2500.00 - 15%
Acima de 2500.00 - 25%*/

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double RH = input.nextInt();
        double RM = input.nextInt();
        double RC = RH+RM;
        double IR = 0;
        double RL = 0;
        String aliquota = "0";

        if ( RC < 900.00 ){
            aliquota = "Isento";
            IR = RC;
            RL = RC;

        } else if ( 900.00 < RC && RC < 1500.00 ) {
            aliquota = "10%";
            IR = RC * 10/100;
            RL = RC - IR;

        } else if ( 1500.00 < RC && RC < 2500.00 ) {
            aliquota = "15%";
            IR = RC * 15/100;
            RL = RC - IR;

        } else if ( 2500.00 < RC ) {
            aliquota = "25%";
            IR = RC * 25/100;
            RL = RC - IR;
        }

        System.out.println("RENDA CONJUNTA: "+RC);
        System.out.println("ALÍQUOTA UTILIZADA: "+aliquota);
        System.out.println("IMPOSTO DE RENDA: "+IR);
        System.out.println("RENDA LÍQUIDA: "+RL);
        input.close();
    }    
}
