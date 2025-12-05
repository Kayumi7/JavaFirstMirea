package pr9;

public class Test {
    int count;

    public static void main(String[] args) {}

    public int getCount() {
        return count;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}
