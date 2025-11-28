package pr1;

public class Factorial {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Факториал " + num + " = " + factorial(num));
    }
}
