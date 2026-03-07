package dosw.bitacora.Semana3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

    public String name;
    public List<Item> items = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
