/*Faça um programa que receba via teclado o tempo de duração de um evento em uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a duração do evento em segundos: ");
        int tempoduracao = input.nextInt();

        int horas = tempoduracao/3600;
        int minutos = (tempoduracao % 3600)/60;
        int segundos = (tempoduracao % 3600)%60;


        if (horas<10 && minutos<10 && segundos<10) {
            System.out.printf("HH:MM:SS = 0"+horas+":0"+minutos+":0"+segundos);
        } else if (horas<10 && minutos<10){
            System.out.printf("HH:MM:SS = 0"+horas+":0"+minutos+":"+segundos);
        } else if (horas<10 && segundos<10){
            System.out.printf("HH:MM:SS = 0"+horas+":"+minutos+":0"+segundos);
        } else if (minutos<10 && segundos<10){
            System.out.printf("HH:MM:SS = "+horas+":0"+minutos+":0"+segundos);
        } else if (horas<10){
            System.out.printf("HH:MM:SS = 0"+horas+":"+minutos+":"+segundos);
        } else if (minutos<10){
            System.out.printf("HH:MM:SS = "+horas+":0"+minutos+":"+segundos);
        } else if (segundos<10){
            System.out.printf("HH:MM:SS = "+horas+":"+minutos+":0"+segundos);
        }

        input.close();
    }
}
