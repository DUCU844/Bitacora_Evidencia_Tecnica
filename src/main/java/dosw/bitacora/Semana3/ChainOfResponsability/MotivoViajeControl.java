package dosw.bitacora.Semana3.ChainOfResponsability;

public class MotivoViajeControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {

        if (!request.isMotivoBalido()){
            System.out.println("Rechazado por motivo de viaje");
            return;
        }

        if (siguiente != null){
            siguiente.procesar(request);
        }
    }
}
