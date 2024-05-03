package application;

import entities.Carta;
import entities.CartaBaralho;
import entities.CartaMao;

public class Main {
    public static void main(String[] args) {
      Carta c1 = new CartaBaralho("Ás","Espadas");
      Carta c2 = new CartaMao("Rei","Copas");
      c1.jogar();
      c1.virar();
      c1.descartar();
      System.out.println("=================================");
      c2.virar();
      c2.jogar();
      c2.descartar();

    }
}