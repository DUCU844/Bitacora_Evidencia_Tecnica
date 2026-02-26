package dosw.bitacora.Semana2.patrones.FactoryMethod;

public class PaypalProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }

}
