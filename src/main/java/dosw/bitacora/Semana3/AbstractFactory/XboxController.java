package dosw.bitacora.Semana3.AbstractFactory;

public class XboxController implements Controller{
    @Override
    public void connect() {
        System.out.println("Control Xbox");
    }
}
