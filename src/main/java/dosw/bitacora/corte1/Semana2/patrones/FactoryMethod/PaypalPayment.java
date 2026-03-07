package dosw.bitacora.Semana2.patrones.FactoryMethod;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with Pay-pal $ " + amount);
    }
}
