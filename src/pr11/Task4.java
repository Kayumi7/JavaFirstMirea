package pr11;

public class Task4 {

    static int count(int k, int s) {
        return countRec(k, s, true);
    }

    static int countRec(int k, int s, boolean first) {
        if (k == 0) return s == 0 ? 1 : 0;
        if (s < 0) return 0;

        int result = 0;
        int start = first ? 1 : 0;

        for (int i = start; i <= 9; i++) {
            result += countRec(k - 1, s - i, false);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(count(2, 5)); // пример
    }
}
