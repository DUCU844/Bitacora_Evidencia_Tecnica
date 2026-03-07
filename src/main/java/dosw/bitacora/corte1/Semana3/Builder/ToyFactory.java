package dosw.bitacora.Semana3.Builder;

public class ToyFactory {
    public ToyDollBuilder builder;

    public void constructorDoll(ToyDollBuilder builder){
        this.builder = builder;
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
    }
}
