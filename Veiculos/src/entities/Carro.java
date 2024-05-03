package entities;

public class Carro extends Veiculos{
    protected String marca;
    protected String modelo;
    protected String cor;

    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }

    @Override
    public void obterInfo() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
    }
}
