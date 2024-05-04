package entities;

import entities.Carta;
import entities.CartaBaralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Carta> baralho;
    private List<Carta> mao;

    public Deck() {
        baralho = new ArrayList<>();
        mao = new ArrayList<>();
        String[] naipes = {"Espadas", "Copas", "Ouros", "Paus"};
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        for (String naipe : naipes) {
            for (String face : faces) {
                baralho.add(new CartaBaralho(face, naipe));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
        System.out.println("Cartas embaralhadas.");
    }

    public void puxarCarta() {
        if (!baralho.isEmpty()) {
            Carta carta = baralho.remove(0);
            mao.add(carta);
            System.out.println("Carta puxada: " + carta.getFace() + " de " + carta.getNaipe());
        } else {
            System.out.println("Não há mais cartas no baralho.");
        }
    }

    public void virarCartaNaMao(int indice) {
        if (indice >= 0 && indice < mao.size()) {
            Carta carta = mao.get(indice);
            carta.virar();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void descartarCartaDaMao(int indice) {
        if (indice >= 0 && indice < mao.size()) {
            Carta carta = mao.remove(indice);
            carta.descartar();
            System.out.println("Carta descartada: " + carta.getFace() + " de " + carta.getNaipe());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarCartasNaMao() {
        if (mao.isEmpty()) {
            System.out.println("Você não tem cartas na mão.");
        } else {
            System.out.println("Cartas na mão:");
            for (int i = 0; i < mao.size(); i++) {
                System.out.println(i + ": " + mao.get(i).getFace() + " de " + mao.get(i).getNaipe());
            }
        }
    }

    public void mostrarBaralho() {
        if (baralho.isEmpty()) {
            System.out.println("O baralho está vazio.");
        } else {
            System.out.println("Cartas no baralho:");
            for (Carta carta : baralho) {
                System.out.println(carta.getFace() + " de " + carta.getNaipe());
            }
        }
    }
}
