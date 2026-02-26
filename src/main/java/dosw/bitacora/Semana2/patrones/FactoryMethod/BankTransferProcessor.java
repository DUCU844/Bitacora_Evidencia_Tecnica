package dosw.bitacora.Semana2.patrones.FactoryMethod;

public class BankTransferProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new BankTransferPayment();
    }
}
