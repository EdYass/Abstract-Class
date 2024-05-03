package entities;

public class Quadrado extends FiguraGeometrica{
    protected float side;

    public Quadrado(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void calculoArea() {
        System.out.println("Área do Quadrado: "+Math.pow(side,2));
    }

    @Override
    public void calculoPerimetro() {
        System.out.println("Perímetro do Quadrado: "+(4*side));
    }
}
