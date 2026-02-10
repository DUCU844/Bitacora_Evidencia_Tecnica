package dosw.bitacora.Semana1.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsEjercicio1 {
    public List<Integer> paresMayoresDeDiez() {

        List<Integer> numeros = List.of(11, 8, 12, 9, 15, 39, 1, 4, 83, 26);

        return numeros.stream()
                .filter(num -> num > 10)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }
}
