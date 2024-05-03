package application;

import entities.Caminhao;
import entities.Carro;
import entities.Moto;
import entities.Veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculos v1 = new Carro("Toyota","Corolla","Prata");
        Veiculos v2 = new Moto("Honda","CB 100R","Vermelha");
        Veiculos v3 = new Caminhao("Volvo","FH-540","Preto");
        v1.acelerar();
        System.out.println("=====================");
        v2.frear();
        System.out.println("=====================");
        v3.obterInfo();
    }
}