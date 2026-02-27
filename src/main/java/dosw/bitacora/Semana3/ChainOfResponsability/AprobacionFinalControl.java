package dosw.bitacora.Semana3.ChainOfResponsability;

public class AprobacionFinalControl extends ControlMigratorioHandler{

    @Override
    public void procesar(IngresoRequest request) {

        if (!request.isAprobado()){
            System.out.println("Rechazado");
            return;
        }

        if (siguiente != null){
            siguiente.procesar(request);
        }
    }
}
