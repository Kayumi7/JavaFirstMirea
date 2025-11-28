package pr7;

import java.util.Random;

public class ExtraTask2 {
    public static void main(String[] args) {
        Random rand = new Random(1000); // seed = 1000

        System.out.println("50 случайных чисел от 0 до 100:");
        for (int i = 0; i < 50; i++) {
            System.out.print(rand.nextInt(100) + " ");
        }
    }
}
