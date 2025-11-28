package pr7;

import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату в формате ГГГГ ММ ДД:");
        int year = sc.nextInt() - 1900; // Date считает годы с 1900
        int month = sc.nextInt() - 1;   // месяцы с 0
        int day = sc.nextInt();

        Date userDate = new Date(year, month, day);
        Date currentDate = new Date();

        System.out.println("Дата пользователя: " + userDate);
        System.out.println("Текущая дата: " + currentDate);

        if (userDate.before(currentDate)) {
            System.out.println("Введённая дата раньше текущей.");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введённая дата позже текущей.");
        } else {
            System.out.println("Даты совпадают.");
        }
    }
}
