package pr12;

import java.util.Scanner;

public class Exception3 {

    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        new Exception3().exceptionDemo();
    }
}

//Объяснение нового поведения
//Exception — родительский класс для всех исключений
//Теперь:
//Любое исключение будет перехвачено
//Программа не упадёт
//Минус: теряется точность обработки (неясно, какая именно ошибка)