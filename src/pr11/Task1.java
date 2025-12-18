package pr11;

public class Task1 {

    static void printSequence(int n, int current) {
        if (n <= 0) return;

        for (int i = 0; i < current && n > 0; i++) {
            System.out.print(current + " ");
            n--;
        }

        printSequence(n, current + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printSequence(n, 1);
    }
}
