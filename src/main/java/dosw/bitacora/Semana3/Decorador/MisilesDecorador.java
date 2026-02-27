package dosw.bitacora.Semana3.Decorador;

public class MisilesDecorador extends BarcoBaseDecorador{

    public MisilesDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription() + "Misiles ";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 40 ;
    }

    @Override
    public int defensa() {
        return super.defensa();
    }
}
