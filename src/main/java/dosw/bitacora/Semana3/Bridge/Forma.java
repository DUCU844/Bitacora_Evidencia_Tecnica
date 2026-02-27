package dosw.bitacora.Semana3.Bridge;

public abstract class Forma {

    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }
    abstract void dibujar();
}

