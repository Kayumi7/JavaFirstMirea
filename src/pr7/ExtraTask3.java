package pr7;

import java.util.GregorianCalendar;

public class ExtraTask3 {
    public static void main(String[] args) {

        // 1) Текущая дата
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // чтобы от 1 до 12
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата:");
        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day);

        // 2) Установка времени в миллисекундах
        calendar.setTimeInMillis(1234567898765L);

        int year2 = calendar.get(GregorianCalendar.YEAR);
        int month2 = calendar.get(GregorianCalendar.MONTH) + 1;
        int day2 = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nДата для времени 1234567898765L:");
        System.out.println("Год: " + year2);
        System.out.println("Месяц: " + month2);
        System.out.println("День: " + day2);
    }
}
