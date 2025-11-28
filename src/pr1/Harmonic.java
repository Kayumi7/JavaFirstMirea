package pr1;

public class Harmonic {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double h = 1.0 / i;
            System.out.printf("1/%d = %.4f%n", i, h);
        }
    }
}
