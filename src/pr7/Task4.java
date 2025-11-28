package pr7;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год, месяц и число:");
        int year = sc.nextInt();
        int month = sc.nextInt() - 1;
        int day = sc.nextInt();

        System.out.println("Введите часы и минуты:");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Date d = new Date(year - 1900, month, day, hour, minute);
        System.out.println("Date: " + d);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hour, minute);
        System.out.println("Calendar: " + cal.getTime());
    }
}
