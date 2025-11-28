package pr5;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== MovablePoint и MovableCircle ===");
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Начало: " + p);
        p.moveRight();
        p.moveUp();
        System.out.println("После moveRight() и moveUp(): " + p);

        MovableCircle circle = new MovableCircle(10, 10, 1, 1, 5);
        System.out.println("Circle начальный: " + circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println("Circle после moveLeft(), moveDown(): " + circle);

        System.out.println("\n=== MovableRectangle ===");
        MovableRectangle rect = new MovableRectangle(0, 0, 4, 3, 1, 1);
        System.out.println("Rect начальный: " + rect);
        System.out.println("Same speed? " + rect.hasSameSpeed());
        rect.moveRight();
        rect.moveDown();
        System.out.println("Rect после moveRight(), moveDown(): " + rect);

        System.out.println("\n=== Nameable примеры ===");
        Nameable[] nameables = {
                new Planet("Earth", 5.972e24),
                new Car("Toyota", "Corolla"),
                new Animal("Buddy", "Dog")
        };
        for (Nameable n : nameables) {
            System.out.println(n.getClass().getSimpleName() + " name: " + n.getName());
        }

        System.out.println("\n=== Priceable пример ===");
        Priceable[] goods = {
                new Product("SSD 1TB", 89.99),
                new Product("RAM 16GB", 59.50)
        };
        for (Priceable pObj : goods) {
            System.out.println(((Product)pObj).getName() + " price: " + pObj.getPrice());
        }
    }
}
