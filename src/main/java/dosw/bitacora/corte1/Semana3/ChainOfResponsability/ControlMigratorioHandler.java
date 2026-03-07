package dosw.bitacora.Semana3.ChainOfResponsability;

public class ControlMigratorioHandler implements ControlMigratorio{

    ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente){
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(IngresoRequest request) {
    }
}
