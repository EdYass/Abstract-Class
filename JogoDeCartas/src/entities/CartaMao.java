package entities;

public class CartaMao extends Carta{
    public CartaMao(String face, String naipe) {
        super(face, naipe);
    }

    @Override
    public void virar() {
        System.out.println("Virando a carta na mão: "+face+" de "+naipe);
    }

    @Override
    public void jogar() {
        System.out.println("Jogano uma carta da mão: "+face+" de "+naipe);
    }

    @Override
    public void descartar() {
        System.out.println("Descartando a carta da mão: "+face+" de "+naipe);
    }
}
