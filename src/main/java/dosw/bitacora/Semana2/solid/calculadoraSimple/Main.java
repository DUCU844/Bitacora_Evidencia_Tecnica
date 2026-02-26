package dosw.bitacora.Semana2.solid.calculadoraSimple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("=== CALCULADORA ===");

        while (true) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Salir");

            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double a = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double b = scanner.nextDouble();

            Operation operation = null;

            switch (option) {
                case 1:
                    operation = new Addition();
                    break;
                case 2:
                    operation = new Subtraction();
                    break;
                case 3:
                    operation = new Multiplication();
                    break;
                case 4:
                    operation = new Division();
                    break;
                default:
                    System.out.println("Opción inválida");
                    continue;
            }

            try {
                double result = calculator.calculate(operation, a, b);
                System.out.println("Resultado: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}