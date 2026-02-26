package dosw.bitacora.Semana2.patrones.FactoryMethod;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Pay with credit card $" + amount);
    }
}
