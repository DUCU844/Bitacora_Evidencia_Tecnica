package dosw.bitacora.Semana3.ChainOfResponsability;

public class AntecedentesControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {

        if (!request.isAntecedentes()){
            System.out.println("Rechazado por antecedentes.");
            return;
        }

        if (siguiente != null){
            siguiente.procesar(request);
        }
    }
}
