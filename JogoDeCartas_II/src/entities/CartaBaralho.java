package entities;

public class CartaBaralho extends Carta{
    private boolean viradaParaCima;

    public CartaBaralho(String face, String naipe) {
        super(face, naipe);
        this.viradaParaCima = false;
    }

    @Override
    public void virar() {
        viradaParaCima = !viradaParaCima;
        if (viradaParaCima) {
            System.out.println("Carta virada para cima: " + getFace() + " de " + getNaipe());
        } else {
            System.out.println("Carta virada para baixo.");
        }
    }

    @Override
    public void descartar() {
        System.out.println("Descartando a carta: " + getFace() + " de " + getNaipe());
    }
}