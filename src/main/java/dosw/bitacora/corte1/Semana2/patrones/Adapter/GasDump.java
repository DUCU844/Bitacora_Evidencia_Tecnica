package dosw.bitacora.Semana2.patrones.Adapter;

public class GasDump implements FuelService {

    @Override
    public void supply(int liters) {
        System.out.println("Suministrando gasolina: " + liters + " litros");
    }
}
