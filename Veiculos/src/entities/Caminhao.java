package entities;

public class Caminhao extends Carro{

    public Caminhao(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }
    public void acelerar() {
        System.out.println("O caminhão está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão está freando");
    }

    @Override
    public void obterInfo() { super.obterInfo();
    }

}
