package pr12;

public class Exception8 {

    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Возраст меньше 18 лет");
        }
        System.out.println("Доступ разрешён");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

//Объяснение
//MyException наследуется от Exception
//Исключение создаётся вручную с помощью throw
//Метод checkAge() объявляет throws MyException
//Исключение перехватывается в main
//Пользовательские исключения применяются, когда:
//стандартных исключений недостаточно
//нужно описать логическую ошибку программы