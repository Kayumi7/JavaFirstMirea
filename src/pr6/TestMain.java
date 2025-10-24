package pr6;

public class TestMain {
    public static void main(String[] args) {
        MyInterface mc1 = new Main();

        double powResult = mc1.pow(2, 5);
        double absResult = mc1.abs(3, 4);

        System.out.println("2^5 = " + powResult);
        System.out.println("|3 + 4i| = " + absResult);

        Main func = new Main();
        double length = func.circleLength(5);
        System.out.println("Длина окружности радиусом S = " + length);
    }
}


