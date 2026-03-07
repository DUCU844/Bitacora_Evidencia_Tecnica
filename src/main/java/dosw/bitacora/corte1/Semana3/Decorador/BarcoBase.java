package dosw.bitacora.Semana3.Decorador;

public class BarcoBase implements Barco {

    @Override
    public String getDescription() {
        return "Barco base ";
    }
    @Override
    public int poderAtaque() {
        return 100;
    }

    @Override
    public int defensa() {
        return 100;
    }

}
