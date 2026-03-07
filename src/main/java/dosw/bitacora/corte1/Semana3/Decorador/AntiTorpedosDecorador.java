package dosw.bitacora.Semana3.Decorador;

public class AntiTorpedosDecorador extends BarcoBaseDecorador {

    public AntiTorpedosDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription(){
        return barco.getDescription() + "Anti Torpedos ";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 20;
    }

    @Override
    public int defensa() {
        return super.defensa();
    }
}
