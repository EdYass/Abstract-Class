package application;

import entities.Circulo;
import entities.FiguraGeometrica;
import entities.Quadrado;
import entities.Triangulo;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Quadrado(3f);
        FiguraGeometrica f2 = new Circulo(3f);
        FiguraGeometrica f3 = new Triangulo();
        f1.calculoArea();
        f1.calculoPerimetro();
        System.out.println("==========================================");
        f2.calculoArea();
        f2.calculoPerimetro();
        System.out.println("==========================================");
        f3.calculoArea();
        f3.calculoPerimetro();
    }
}