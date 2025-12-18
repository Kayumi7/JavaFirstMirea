package pr12;

//import java.util.Scanner;
//
//public class Exception2 {
//
//    public void exceptionDemo() {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        String intString = myScanner.next();
//        int i = Integer.parseInt(intString);
//        System.out.println(2 / i);
//    }
//
//    public static void main(String[] args) {
//        new Exception2().exceptionDemo();
//    }
//}

//Какие исключения возникают
//Ввод	Исключение
//Qwerty	NumberFormatException
//0	ArithmeticException
//1.2	NumberFormatException
//1	Ошибки нет


import java.util.Scanner;

public class Exception2 {

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
        }
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}

//Объяснение
//NumberFormatException — если введена строка или дробное число
//ArithmeticException — при делении на ноль
//Программа корректно реагирует, не завершается аварийно