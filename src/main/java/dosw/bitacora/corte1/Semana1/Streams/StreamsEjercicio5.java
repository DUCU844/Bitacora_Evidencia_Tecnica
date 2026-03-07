package dosw.bitacora.Semana1.Streams;

import java.util.List;

public class StreamsEjercicio5 {

    List<Transaccion> transacciones = List.of(
            new Transaccion("T1", 500.0, true),
            new Transaccion("T2", 1200.0, true),
            new Transaccion("T3", 300.0, false),
            new Transaccion("T4", 700.0, true)
    );

    public boolean validarLote() {
        return  !transacciones.stream()
                .peek(tra -> System.out.println("Procesando: " + tra))
                .anyMatch(tra -> !tra.isApproved());
    }
}
