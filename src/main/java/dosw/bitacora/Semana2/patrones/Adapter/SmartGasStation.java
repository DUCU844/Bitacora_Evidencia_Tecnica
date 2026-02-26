package dosw.bitacora.Semana2.patrones.Adapter;

public class SmartGasStation {
    public static void main(String[] args) {

        FuelService gasolinePump = new GasDump();

        FuelService fastElectricPump =
                new FastChargerAdapter(new FastElectricCharger());

        FuelService slowElectricPump =
                new SlowChargerAdapter(new SlowElectricCharger());

        gasolinePump.supply(30);
        fastElectricPump.supply(30);
        slowElectricPump.supply(30);
    }
}
