package pr1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        // --- Генерация с Math.random() ---
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 100);
        }

        // --- Генерация с классом Random ---
        Random rnd = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rnd.nextInt(100);
        }

        System.out.println("Массив (Math.random): " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Отсортированный:      " + Arrays.toString(arr1));

        System.out.println("\nМассив (Random): " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Отсортированный: " + Arrays.toString(arr2));
    }
}
