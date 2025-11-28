package pr3;

public class TestShape {
    public static void main(String[] args) {
        var s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimeter = " + s1.getPerimeter());
        System.out.println("Color = " + s1.getColor());
        System.out.println("Filled = " + s1.isFilled());

        Circle c1 = s1;
        System.out.println("Radius = " + c1.getRadius());

        Shape s2 = new Rectangle(2.0, 4.0, "blue", true);
        System.out.println(s2);
        System.out.println("Area = " + s2.getArea());
        System.out.println("Perimeter = " + s2.getPerimeter());

        var s3 = new Square(3.0, "green", true);
        System.out.println(s3);
        System.out.println("Area = " + s3.getArea());
        System.out.println("Perimeter = " + s3.getPerimeter());

        Square sq1 = s3;
        System.out.println("Side = " + sq1.getSide());
    }
}
