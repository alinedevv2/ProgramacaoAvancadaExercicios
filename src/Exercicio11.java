/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o horário que o jogo começou:");
        int hrInicial = input.nextInt();
        System.out.println("Digite o horário que o jogo terminou:");
        int hrFinal = input.nextInt();

        if (hrInicial > hrFinal) { 
            System.out.println("O JOGO DUROU " + (24 - (hrInicial - hrFinal)) + " HORA(S)");
        } else if (hrFinal > hrInicial) {
            System.out.println("O JOGO DUROU " + (hrFinal - hrInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        input.close();
    }
}