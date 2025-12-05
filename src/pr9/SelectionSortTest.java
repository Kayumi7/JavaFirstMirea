package pr9;

import java.util.Random;

public class SelectionSortTest {
    public static void main(String[] args) {

        int n = 100_000;
        int[] array = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1_000_000);
        }

        StopWatch2 sw = new StopWatch2();
        sw.start();

        selectionSort(array);

        sw.stop();

        System.out.println("Время сортировки selection sort: " + sw.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
