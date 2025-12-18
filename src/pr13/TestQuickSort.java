package pr13;

public class TestQuickSort {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Ivan", 3.8),
                new Student(2, "Anna", 4.9),
                new Student(3, "Petr", 4.1)
        };

        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        QuickSort.quickSort(students, 0, students.length - 1, comp);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
