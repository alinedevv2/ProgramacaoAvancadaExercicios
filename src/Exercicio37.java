/*Amarelinha provavelmente é a brincadeira em que as crianças da vila mais se
divertem, porém a mesma vem causando um bom tempo de discussão e choro nas
crianças que a praticam. A causa do transtorno é para decidir quem será o próximo
a pular, mas recentemente, Quico (O gênio!) teve uma grande ideia para solucionar
o problema. Basicamente a brincadeira só poderá ser jogada de dois em dois
jogadores e para escolher o próximo jogador, Quico indicou o uso do tradicional
método par ou ímpar, onde os dois jogadores informam um número e se a soma
desses números for par o jogador que escolheu PAR ganha ou vice versa.
Entretanto a utilização desse método vem deixando o Quico louco, louco, louco... E
por esse motivo ele pediu a sua ajuda! Solicitou a você um programa que dado o
jogador dos jogadores, suas respectivas escolhas PAR ou ÍMPAR e os números,
informe quem foi o vencedor.
Entrada
Cada caso de teste contém duas linhas. Na primeira linha será informado o jogador do
jogador 1 seguido de sua escolha, “PAR” ou "ÍMPAR" e o número escolhido, logo
após, o jogador do jogador 2 seguido de sua escolha, “PAR” ou "ÍMPAR” e o número
escolhido. É garantido que a escolha (PAR ou ÍMPAR) do jogador 1 será diferente da
escolha (PAR ou ÍMPAR) do jogador 2 e que o jogador dos jogadores são formados
somente por letras e não ultrapassarão 10 caracteres.
Saída
Para cada caso de teste, imprima uma única linha contendo o jogador do jogador
vencedor. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercicio37 {
    public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int QT = Integer.parseInt(input.readLine());
		String linha1[], linha2[], jogador1, escolha1, jogador2, escolha2;
		int N, M;
		for (int i = 0; i < QT; i++) {
			linha1 = input.readLine().split(" ");
			linha2 = input.readLine().split(" ");
			N = Integer.parseInt(linha2[0]);
			M = Integer.parseInt(linha2[1]);
			jogador1 = linha1[0];
			escolha1 = linha1[1];
			jogador2 = linha1[2];
			escolha2 = linha1[3];
			
			if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) ||
			    ((N + M) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) System.out.println(jogador1);
			else System.out.println(jogador2);
		}
    }
}

