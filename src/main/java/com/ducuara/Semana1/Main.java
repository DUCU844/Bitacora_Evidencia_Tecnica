package com.ducuara.Semana1;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        StreamsEjercicio1 ejercicio1 = new StreamsEjercicio1();

        List<Integer> resultado = ejercicio1.paresMayoresDeDiez();

        System.out.println("Números pares mayores a 10:");
        resultado.forEach(System.out::println);
    }
}