package dosw.bitacora.Semana3.ChainOfResponsability;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest request);
}
