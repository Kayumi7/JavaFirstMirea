package pr12;

//public class Exception7 {
//
//    public static void riskyMethod() throws ArithmeticException {
//        int a = 10 / 0;
//        System.out.println(a);
//    }
//
//    public static void main(String[] args) {
//        riskyMethod();
//    }
//}

//Объяснение
//Метод riskyMethod():
//содержит ошибку деления на ноль
//объявляет throws ArithmeticException
//Исключение не обрабатывается
//JVM завершает программу с ошибкойОбъяснение
//Метод riskyMethod():
//содержит ошибку деления на ноль
//объявляет throws ArithmeticException
//Исключение не обрабатывается
//JVM завершает программу с ошибкой

public class Exception7 {

    public static void riskyMethod() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
}
