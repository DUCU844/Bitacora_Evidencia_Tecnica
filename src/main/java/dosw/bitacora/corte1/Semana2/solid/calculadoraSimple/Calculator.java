package dosw.bitacora.Semana2.solid.calculadoraSimple;

public class Calculator {

    public double calculate(Operation operation, double a, double b) {
        return operation.execute(a, b);
    }
}