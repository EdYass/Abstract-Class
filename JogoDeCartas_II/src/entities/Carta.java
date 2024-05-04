package entities;

public abstract class Carta {
    private String face;
    private String naipe;

    public Carta(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }

    public abstract void virar();

    public abstract void descartar();

    public String getFace() {
        return face;
    }

    public String getNaipe() {
        return naipe;
    }
}


