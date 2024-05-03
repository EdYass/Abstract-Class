package entities;

public class Moto extends Carro{
    public Moto(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando");
    }

    @Override
    public void obterInfo() {
       super.obterInfo();
    }
}
