/*Elabore um programa que receba três números inteiros representando os
tamanhos dos lados de um triângulo. Verifique se os números informados formam
um triângulo, ou seja, cada um dos lados informados tem que ser menor que a soma
dos outros dois. Em caso positivo informar qual tipo de triângulo seria formado:
● Equilátero se os três lados forem iguais;
● Isósceles se dois lados forem iguais;
● Escaleno se os três lados forem diferentes.
Entrada
Serão recebidos três valores inteiros.
Saída
Se os valores informados formarem lados de um triângulo será informando o tipo do
triângulo, em caso contrário deverá dar a mensagem, “VALORES NÃO FORMAM UM TRIÂNGULO”. */

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;

        System.out.print("Digite o lado A=");
        A = input.nextInt();		
        System.out.print("Digite o lado B=");
        B = input.nextInt();	
		System.out.print("Digite o lado C=");
        C = input.nextInt();


		if( A < B + C && B < A + C && C < A + B ){
			if(A==B && B == C){
				System.out.print("EQUILÁTERO");
			}else if(A==B || A==C || B==C){
				System.out.print("ISÓSCELES");
			}else{
				System.out.print("ESCALENO");
			}
		}else{
			System.out.print("VALORES NÃO FORMAM UM TRIÂNGULO");
		}
        input.close();
    }
}
