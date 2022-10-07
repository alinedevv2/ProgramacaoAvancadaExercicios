//Exercicio 1 - Lista 2

public class Transporte {
        private int id;
        private int ano;
        private String modelo;
        private double carga_maxima;
        private double potencia;

        public double consumo(){
            return potencia*carga_maxima*100;
        }

        public String leiaModelo(){
            return modelo;
        }

        public static void gravaModelo(String[] args){

        }

        public Transporte (int id, int ano, String modelo, double carga_maxima, double potencia){
            this.id = id;
            this.ano = ano;
            this.modelo = modelo;
            this.carga_maxima = carga_maxima;
            this.potencia = potencia;
        }

}
