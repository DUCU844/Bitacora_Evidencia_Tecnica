package dosw.bitacora.Semana3.Decorador;

public class BlindajeDecorador extends BarcoBaseDecorador{

    public BlindajeDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription() + "Blindaje ";
    }

    @Override
    public int poderAtaque() {
        return super.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 30;
    }
}
