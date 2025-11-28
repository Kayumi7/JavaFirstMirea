package pr1;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};

        int sumFor = 0;
        for (int i = 0; i < arr.length; i++) {
            sumFor += arr[i];
        }

        int sumWhile = 0;
        int i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }

        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += arr[j];
            j++;
        } while (j < arr.length);

        System.out.println("Сумма (for): " + sumFor);
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do-while): " + sumDoWhile);
    }
}
