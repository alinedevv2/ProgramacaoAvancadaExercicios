/*Escreva um programa para calcular e escrever o valor de S, sendo S dado pela fórmula: S = 1 + 3/2 + 5/4 + 7/8 +... + 39/?
Entrada
Não há nenhuma entrada neste problema.
Saída
A saída contém um valor correspondente ao valor de S. */



public class Exercicio35 {
    public static void main(String[] args) {
    	double S = 1;
    	int cont = 2;
    	for (int i = 3; i <= 39; i++) {
    		if (i % 2 == 1)  {
    			S += (double) i / cont;
        		cont *= 2.00;
    		}
    	}
    	System.out.println(String.format("%.2f", S));
    }

}
