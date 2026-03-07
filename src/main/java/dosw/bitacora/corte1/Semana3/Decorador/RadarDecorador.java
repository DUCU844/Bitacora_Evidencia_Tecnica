package dosw.bitacora.Semana3.Decorador;

public class RadarDecorador extends BarcoBaseDecorador{

    public RadarDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription() + "Radar ";
    }

    @Override
    public int poderAtaque() {
        return super.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 10;
    }
}
