package pr13;

public class TestInsertionSort {

    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Ivan", 4.2),
                new Student(1, "Anna", 4.8),
                new Student(5, "Petr", 3.9),
                new Student(2, "Olga", 4.5)
        };

        InsertionSort.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
