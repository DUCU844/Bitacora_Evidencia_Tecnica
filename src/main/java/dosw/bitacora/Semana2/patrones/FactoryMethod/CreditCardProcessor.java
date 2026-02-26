package dosw.bitacora.Semana2.patrones.FactoryMethod;

public class CreditCardProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
