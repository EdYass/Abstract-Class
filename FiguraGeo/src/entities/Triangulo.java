package entities;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica{
    protected float ladoA;
    protected float ladoB;
    protected float ladoC;
    protected float side;
    private int tipo;

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public float getSide() {
        return side;
    }

    public double equilatero(){
        return (Math.pow(this.side,2)*Math.sqrt(3))/4;
    }

    public void coletarDados(){
        Scanner scr = new Scanner(System.in);
        System.out.println("1-Equilátero | 2-Isóscceles | 3-Escalo");
        System.out.printf("Digite qual tipo de Triângulo: ");
        tipo = scr.nextInt();
    }
    @Override
    public void calculoArea() {
        Scanner scr = new Scanner(System.in);
        coletarDados();
        if (tipo == 1){
            System.out.printf("Digite o tamanaho do lado do Triângulo: ");
            this.side = scr.nextFloat();
            System.out.println("Área do Triângulo Equilátero: "+equilatero());
        }else if(tipo == 2){
            System.out.println("Digite o tamanho os lados do triangulo do menor para o maior");
            System.out.printf("Lado A: ");
            ladoA = scr.nextFloat();
            System.out.printf("Lado B ");
            ladoB = scr.nextFloat();
            System.out.printf("Lado C: ");
            ladoC = scr.nextFloat();
            if(ladoA != ladoB && ladoB != ladoC && ladoA != ladoC){
                System.out.println("Tipo incorreto");
            }
            if(ladoA == ladoB && ladoB == ladoC && ladoA == ladoC){
                System.out.println("Tipo incorreto");
            }
            double hipotenusa = Math.sqrt(Math.pow(ladoA,2)-Math.pow(ladoC/2,2));
            System.out.println("Area do Triangulo Isósceles: "+(hipotenusa*ladoC)/2);
        }else if(tipo == 3){
            System.out.println("Digite o tamanho os lados do triangulo do menor para o maior");
            System.out.printf("Lado A: ");
            ladoA = scr.nextFloat();
            System.out.printf("Lado B ");
            ladoB = scr.nextFloat();
            System.out.printf("Lado C: ");
            ladoC = scr.nextFloat();
            if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Tipo incorreto");
            }
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Tipo incorreto");
            }
            float p = (ladoA+ladoB+ladoC)/2;
            System.out.println("Área do Triângulo Escaleno: "+Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC)));
        }else{
            System.out.println("Tipo INVÁLIDO !!!!");
        }

    }

    @Override
    public void calculoPerimetro() {
        float soma =ladoA+ladoB+ladoC;
        if (tipo==1){
            System.out.println("Perimetro: "+this.side*3);
        }
        if (tipo==2){
            System.out.println("Perimetro: "+soma);
        }
        if (tipo==3){
            System.out.println("Perimetro: "+soma);
        }
    }
}
