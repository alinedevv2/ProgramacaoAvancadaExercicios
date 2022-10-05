/*João e Maria estão querendo obter informações sobre Os carros da sua cidade. Para isso eles pediram que você escrevesse um programa para ajudá-los. Eles vão
digitar Informações de três diferentes carros. Para cada carro serão lidos o ano e a velocidade. O programa deve exibir, o ano do carro mais novo e a velocidade do mais rápido.
Entrada
Um valor inteiro (ano) e um em ponto flutuante (velocidade).
Saída
Maior velocidade, maior ano e velocidade média. */

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        int carromaisrapido = 0;
        int carromaisnovo = 0;

        while (cont<3){
            System.out.println("Digite o ano e a velocidade do carro: ");
            int ano = input.nextInt();
            int velocidade = input.nextInt();
            if ((carromaisnovo == 0) && (carromaisrapido == 0)){
                carromaisnovo = ano;
                carromaisrapido = velocidade;
            }
            if (ano < carromaisnovo) carromaisnovo = ano;
            if (velocidade > carromaisrapido) carromaisrapido = velocidade;
            carromaisnovo = ano;
            cont++;
        }
        System.out.println("Ano do carro mais novo =  "+carromaisnovo);
        System.out.println("Velocidade do mais rápido =  "+carromaisrapido);
        input.close();
    }
}
