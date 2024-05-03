package entities;

public class Circulo extends FiguraGeometrica{
    protected float circle;

    public Circulo(float circle) {
        this.circle = circle;
    }

    public float getCircle() {
        return circle;
    }

    public void setCircle(float circle) {
        this.circle = circle;
    }

    @Override
    public void calculoArea() {
        System.out.printf("Área do círculo: %.3f",Math.PI*Math.pow(circle,2));
    }

    @Override
    public void calculoPerimetro() {
        System.out.printf("\nCircunferencia do cículo: %.3f\n",2*Math.PI*circle);
    }
}
