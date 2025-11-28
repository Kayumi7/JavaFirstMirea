package pr7;

import java.text.DateFormat;
import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Date birth = new Date(2004 - 1900, 4 - 1, 12); // 12.04.2004
        Student st = new Student("Иван Петров", birth);

        System.out.println(st);
        System.out.println("Короткий формат: " +
                st.getBirthDateFormatted(DateFormat.SHORT));
        System.out.println("Средний формат: " +
                st.getBirthDateFormatted(DateFormat.MEDIUM));
        System.out.println("Полный формат: " +
                st.getBirthDateFormatted(DateFormat.FULL));
    }
}
