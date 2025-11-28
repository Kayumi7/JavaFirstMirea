package pr5;

public class Product implements Priceable {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() { return price; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("Product{name='%s', price=%.2f}", name, price);
    }
}
