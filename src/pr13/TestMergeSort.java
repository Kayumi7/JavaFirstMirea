package pr13;

public class TestMergeSort {

    public static void main(String[] args) {
        Student[] group1 = {
                new Student(1, "Ivan", 4.0),
                new Student(3, "Anna", 4.5)
        };

        Student[] group2 = {
                new Student(2, "Petr", 3.9),
                new Student(4, "Olga", 4.8)
        };

        Student[] merged = MergeSort.mergeSort(group1, group2);

        for (Student s : merged) {
            System.out.println(s);
        }
    }
}
