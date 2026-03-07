package dosw.bitacora.Semana3.Builder;

public class ClassicDollBuilder implements ToyDollBuilder{

    private ToyDoll doll;

    public ClassicDollBuilder(){
        doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Head classic");
    }

    @Override
    public void buildBody() {
        doll.setBody("Body classic");
    }

    @Override
    public void buildArms() {
        doll.setArms("Arms classic");
    }
    @Override
    public void buildLegs() {
        doll.setLegs("Legs classic");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
    }

    public ToyDoll getResult() {
        return doll;
    }

}
