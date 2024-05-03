package entities;

public abstract class Carta {
    protected String face;
    protected String naipe;

    public Carta(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }

    public abstract void virar();
    public abstract void jogar();
    public abstract void descartar();
}
