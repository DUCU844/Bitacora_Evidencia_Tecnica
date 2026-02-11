package dosw.bitacora.Semana1.Streams;

public class Transaccion {

    String id;
    double amount;
    boolean approved;

    public Transaccion(String id, double amount, boolean approved) {
        this.id = id;
        this.amount = amount;
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", approved=" + approved +
                '}';
    }

}
