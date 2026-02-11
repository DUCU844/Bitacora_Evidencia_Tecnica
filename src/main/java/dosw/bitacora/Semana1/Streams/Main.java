package dosw.bitacora.Semana1.Streams;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StreamsEjercicio1 ejercicio1 = new StreamsEjercicio1();
        StreamsEjercicio2 ejercicio2 = new StreamsEjercicio2();
        StreamsEjercicio3 ejercicio3 = new StreamsEjercicio3();
        StreamsEjercicio5 ejercicio5 = new StreamsEjercicio5();

        List<Integer> resultadoEjercicio1 = ejercicio1.paresMayoresDeDiez();
        List<String> resultadoEjercicio2 = ejercicio2.procesarPalabras();
        List<String> resultadoEjercicio3 = ejercicio3.UsuariosActivos();
        List<String > resultadoEjercicio4 = ejercicio3.UsuariosMayoresDeEdad();
        boolean loteValido = ejercicio5.validarLote();

        System.out.println("Resultado Ejercicio 1: ");
        System.out.println("Números pares mayores a 10:");
        resultadoEjercicio1.forEach(System.out::println);

        System.out.println("\nResultado Ejercicio 2: ");
        System.out.println("Palabras :");
        resultadoEjercicio2.forEach(System.out::println);
        System.out.println("Cantidad de palabras: " + ejercicio2.cantidadPalabras());

        System.out.println("\nResultado Ejercicio 3: ");
        System.out.println("Usuarios activos: ");
        resultadoEjercicio3.forEach(System.out::println);

        System.out.println("\nResultado Ejercicio 4: ");
        System.out.println("Usuarios mayores de edad (18 años): ");
        resultadoEjercicio4.forEach(System.out::println);

        System.out.println("\nResultado Ejercicio 5: ");
        System.out.println("¿El lote es valido? " + loteValido);

    }
}