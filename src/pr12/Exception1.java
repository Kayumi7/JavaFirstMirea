package pr12;

//public class Exception1 {

    //public void exceptionDemo() {
        //System.out.println(2 / 0);
    //}

    //public static void main(String[] args) {
        //Exception1 ex = new Exception1();
        //ex.exceptionDemo();
    //}
//}

//Что происходит
//Происходит деление на ноль
//JVM выбрасывает исключение
//ArithmeticException: / by zero
//Программа аварийно завершается


//public class Exception1 {

    //public void exceptionDemo() {
        //System.out.println(2.0 / 0.0);
    //}

    //public static void main(String[] args) {
        //Exception1 ex = new Exception1();
        //ex.exceptionDemo();
    //}
//}

//Результат
//Исключения нет
//Выводится Infinity
//Потому что в вещественной арифметике Java деление на 0 допустимо


public class Exception1 {

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        new Exception1().exceptionDemo();
    }
}

//Объяснение
//Исключение ArithmeticException перехватывается
//Программа не ломается
//Выполняется код в catch