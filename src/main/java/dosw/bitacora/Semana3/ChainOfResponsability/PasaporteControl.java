package dosw.bitacora.Semana3.ChainOfResponsability;

public class PasaporteControl extends ControlMigratorioHandler{

    @Override
    public void procesar(IngresoRequest request) {

        if (!request.isPasaporteValido()){
            System.out.println("Rechazado por pasaporte");
            return;
        }

        if (siguiente != null){
            siguiente.procesar(request);
        }
    }
}
