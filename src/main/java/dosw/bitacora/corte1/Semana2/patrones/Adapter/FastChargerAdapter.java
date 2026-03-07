package dosw.bitacora.Semana2.patrones.Adapter;

public class FastChargerAdapter implements FuelService{

    private FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters){
        double kWh = convertLitersToKWh(liters);
        charger.fastElectric(kWh);
    }

    private double convertLitersToKWh(int liters){
        return liters * 8.0;
    }
}
