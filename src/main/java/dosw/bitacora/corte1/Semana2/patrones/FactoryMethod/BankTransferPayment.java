package dosw.bitacora.Semana2.patrones.FactoryMethod;

public class BankTransferPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Pay with bank transfer $ " + amount);
    }

}
