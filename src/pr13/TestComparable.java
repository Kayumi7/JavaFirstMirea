package pr13;

import java.util.Arrays;

public class TestComparable {

    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Ivan", 4.2),
                new Student(1, "Anna", 4.8),
                new Student(2, "Petr", 3.9)
        };

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
