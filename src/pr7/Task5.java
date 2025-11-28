package pr7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

    private static long testAdd(List<Integer> list, int size) {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    private static long testInsert(List<Integer> list, int size) {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        return System.nanoTime() - start;
    }

    private static long testSearch(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.contains(i);
        }
        return System.nanoTime() - start;
    }

    private static long testRemove(List<Integer> list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        int size = 20000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Тест добавления:");
        System.out.println("ArrayList: " + testAdd(arrayList, size));
        System.out.println("LinkedList: " + testAdd(linkedList, size));

        arrayList.clear();
        linkedList.clear();

        System.out.println("\nТест вставки в начало:");
        System.out.println("ArrayList: " + testInsert(arrayList, size));
        System.out.println("LinkedList: " + testInsert(linkedList, size));

        System.out.println("\nТест поиска:");
        System.out.println("ArrayList: " + testSearch(arrayList));
        System.out.println("LinkedList: " + testSearch(linkedList));

        System.out.println("\nТест удаления:");
        System.out.println("ArrayList: " + testRemove(arrayList));
        System.out.println("LinkedList: " + testRemove(linkedList));
    }
}
