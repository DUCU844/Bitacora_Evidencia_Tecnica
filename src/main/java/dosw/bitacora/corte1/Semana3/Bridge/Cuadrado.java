package dosw.bitacora.Semana3.Bridge;

public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    void dibujar() {
        System.out.println("Dibujando cuadrado ");
        color.aplicarcolor();
    }
}
