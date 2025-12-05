package pr9;

import java.util.Random;

public class TestCircles {
    public static void main(String[] args) {

        Circle[] circles = new Circle[10];
        Random rand = new Random();

        for (int i = 0; i < circles.length; i++) {
            double r = 1 + rand.nextDouble() * 10; // радиус 1–11
            circles[i] = new Circle(r);
        }

        Circle maxCircle = circles[0];

        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > maxCircle.getArea()) {
                maxCircle = circles[i];
            }
        }

        System.out.println("Круги:");
        for (Circle c : circles)
            System.out.println(c);

        System.out.println("\nКруг с максимальной площадью:");
        System.out.println(maxCircle);
    }
}
