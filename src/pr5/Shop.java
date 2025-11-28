package pr5;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Printable {
    private final String name;
    private final List<ProductSimple> inventory = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public void addProduct(ProductSimple p) { inventory.add(p); }
    public boolean removeProduct(String productName) {
        return inventory.removeIf(p -> p.getName().equalsIgnoreCase(productName));
    }

    public ProductSimple findProductByName(String name) {
        for (ProductSimple p : inventory) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("Shop: " + name);
        if (inventory.isEmpty()) {
            System.out.println("  (no products)");
            return;
        }
        System.out.println("  Inventory:");
        for (ProductSimple p : inventory) {
            System.out.println("   - " + p);
        }
    }

    @Override
    public String toString() {
        return String.format("Shop{name='%s', products=%d}", name, inventory.size());
    }
}
