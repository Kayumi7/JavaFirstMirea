package pr12;

import java.util.Scanner;

public class Exception4 {

    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число");

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");

        } finally {
            System.out.println("Блок finally выполнен");
        }
    }

    public static void main(String[] args) {
        new Exception4().exceptionDemo();
    }
}

//Объяснение поведения программы
//finally выполняется всегда:
//была ошибка
//ошибки не было
//Используется для:
//закрытия файлов
//освобождения ресурсов
//завершающих действий