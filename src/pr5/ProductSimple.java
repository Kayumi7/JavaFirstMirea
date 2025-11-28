package pr5;

public class ProductSimple {
    private final String name;
    private final double price;

    public ProductSimple(String name, double price) {
        this.name = name; this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("%s (%.2f)", name, price);
    }
}
