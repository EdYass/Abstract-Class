package entities;

public class CartaBaralho extends Carta{
    public CartaBaralho(String face, String naipe) {
        super(face, naipe);
    }

    @Override
    public void virar() {
        System.out.println("Carta virada para cima: "+face+" de "+naipe);
    }

    @Override
    public void jogar() {
        System.out.println("Puxando uma carta do baralho: "+face+" de "+naipe);
    }

    @Override
    public void descartar() {
        System.out.println("Descartando a carta do baralho: "+face+" de "+naipe);
    }
}
