package dosw.bitacora.Semana3.Builder;

public class ActionDollBuilder implements ToyDollBuilder{

    private ToyDoll doll;

    public ActionDollBuilder(){
        doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Head action");
    }

    @Override
    public void buildBody() {
        doll.setBody("Body action");
    }

    @Override
    public void buildArms() {
        doll.setArms("Arms action");
    }
    @Override
    public void buildLegs() {
        doll.setLegs("Legs action");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
    }

    public ToyDoll getResult() {
        return doll;
    }

}
