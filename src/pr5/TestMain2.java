package pr5;

public class TestMain2 {
    public static void main(String[] args) {
        // --- Демонстрация Movable (пункт 5) ---
        System.out.println("=== Movable demo ===");
        MovablePoint pt = new MovablePoint(5, 5, 1, 2);
        System.out.println("Start point: " + pt);
        pt.moveUp();
        pt.moveLeft();
        System.out.println("After moveUp & moveLeft: " + pt);

        MovableCircle c = new MovableCircle(0, 0, 3, 3, 7);
        System.out.println("Circle before: " + c);
        c.moveRight(); c.moveDown();
        System.out.println("Circle after moveRight & moveDown: " + c);

        // --- Printable: книги и журналы (пункт 9) ---
        System.out.println("\n=== Printable array (books & magazines) ===");
        Printable[] items = new Printable[] {
                new Book("Clean Code", "Robert C. Martin", 2008, "978-0132350884"),
                new Magazine("Java Magazine", 42, "Nov-Dec 2024"),
                new Book("Effective Java", "Joshua Bloch", 2018, "978-0134685991"),
                new Magazine("Nature", 7801, "July 2023")
        };

        for (int i = 0; i < items.length; i++) {
            System.out.printf("Item %d: ", i);
            items[i].print();
        }

        // --- Shop demo (пункт 8) ---
        System.out.println("\n=== Shop demo ===");
        Shop shop = new Shop("CompuShop");
        shop.addProduct(new ProductSimple("SSD 1TB", 89.99));
        shop.addProduct(new ProductSimple("RAM 16GB", 59.50));
        shop.addProduct(new ProductSimple("Monitor 24\"", 129.0));
        shop.print();

        System.out.println("\nFind product 'RAM 16GB':");
        ProductSimple found = shop.findProductByName("RAM 16GB");
        System.out.println(found != null ? " Found: " + found : " Not found");

        System.out.println("\nRemove product 'SSD 1TB': " + shop.removeProduct("SSD 1TB"));
        shop.print();
    }
}
