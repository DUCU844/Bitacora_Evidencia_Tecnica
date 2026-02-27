package dosw.bitacora.Semana3.Composite;

import javax.swing.*;

public class WareHouseApp {

    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 1200);
        Product mouse = new Product("Mouse", 400);
        Product keyboard = new Product("Keyboard", 80);

        Box accessoriesBox = new Box("Accessories Box");
        accessoriesBox.add(mouse);
        accessoriesBox.add(keyboard);

        Box mainBox = new Box("Main Box");
        mainBox.add(laptop);
        mainBox.add(accessoriesBox);

        System.out.println("Total price $ " + mainBox.getPrice());

    }

}
