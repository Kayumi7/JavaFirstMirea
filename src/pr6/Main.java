package pr6;

public class Main implements MyInterface {
    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double abs(double real, double imag) {
        return Math.sqrt(real * real + imag * imag);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
