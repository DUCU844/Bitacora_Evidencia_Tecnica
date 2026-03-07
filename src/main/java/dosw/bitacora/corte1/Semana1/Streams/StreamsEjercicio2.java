package dosw.bitacora.Semana1.Streams;

import java.util.List;

public class StreamsEjercicio2 {
    public List<String> procesarPalabras() {

        List<String> palabras = List.of("java", "stream", "api", "functional", "code", "git");

        return  palabras.stream()
                .filter(palabra -> palabra.length() == 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }
    public long cantidadPalabras() {
        return procesarPalabras().stream().count();
    }
}
