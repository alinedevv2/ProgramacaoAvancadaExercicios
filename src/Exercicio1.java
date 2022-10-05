/*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5.
A soma dos pesos é 11. Assuma que cada nota pode ir de O até 10.0, sempre com uma casa.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double MEDIA = (nota1 * 3.5 + nota2 * 7.5 ) / 11;
        
        System.out.printf("MEDIA = %.5f", MEDIA);
        input.close();
    }
}
