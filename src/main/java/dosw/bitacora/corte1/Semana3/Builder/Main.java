package dosw.bitacora.Semana3.Builder;

public class Main {
    public static void main(String[] args) {

        ToyFactory factory = new ToyFactory();

        ActionDollBuilder actionDollBuilder = new ActionDollBuilder();
        factory.constructorDoll(actionDollBuilder);
        ToyDoll actionDoll = actionDollBuilder.getResult();

        ClassicDollBuilder classicDollBuilder = new ClassicDollBuilder();
        factory.constructorDoll(classicDollBuilder);
        ToyDoll classicDoll = classicDollBuilder.getResult();

        actionDoll.showInfo();
        classicDoll.showInfo();
    }
}
