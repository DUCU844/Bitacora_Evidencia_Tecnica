package dosw.bitacora.Semana3.Bridge;

public class Circulo extends Forma {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    void dibujar() {
        System.out.println("Dibujando circulo ");
        color.aplicarcolor();
    }
}
