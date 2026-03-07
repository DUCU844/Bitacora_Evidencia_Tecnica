package dosw.bitacora.Semana3.Decorador;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Barco barcoBase = new BarcoBase();

        Map<String, Function<Barco, Barco>> mejoras = Map.of(
                "BLINDAJE", BlindajeDecorador::new,
                "RADAR", RadarDecorador::new,
                "MISILES", MisilesDecorador::new,
                "ANTITORPEDOS", AntiTorpedosDecorador::new
        );

        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        Barco barcoFinal = configuracion.stream()
                .map(mejoras::get)
                .reduce(Function.identity(), Function::andThen)
                .apply(barcoBase);

        System.out.println(barcoFinal.getDescription());
        System.out.println("Ataque: " + barcoFinal.poderAtaque());
        System.out.println("Defensa: " + barcoFinal.defensa());
    }
}
