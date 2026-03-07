package dosw.bitacora.Semana2.patrones.FactoryMethod;

public abstract class PaymentProcessor {

    protected abstract Payment createPayment();

    public void processPayment(double amount){
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
