package pr7;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Иванов"; // Фамилия разработчика
        String received = "27.11.2024 10:00"; // Дата получения задания (пример)

        Date submitDate = new Date(); // текущая дата и время

        System.out.println("Разработчик: " + developer);
        System.out.println("Дата получения задания: " + received);
        System.out.println("Дата сдачи задания: " + submitDate);
    }
}
