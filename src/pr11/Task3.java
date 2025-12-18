package pr11;

public class Task3 {

    static void print(int A, int B) {
        System.out.print(A + " ");
        if (A == B) return;

        if (A < B)
            print(A + 1, B);
        else
            print(A - 1, B);
    }

    public static void main(String[] args) {
        print(5, 1);
    }
}
