package dosw.bitacora.Semana3.Composite;

public class Product implements Item{

    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
