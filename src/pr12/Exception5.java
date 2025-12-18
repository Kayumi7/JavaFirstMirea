package pr12;

//public class Exception5 {
//
//    public void getDetails(String key) {
//        if (key == null) {
//            throw new NullPointerException("null key in getDetails");
//        }
//        System.out.println("Key: " + key);
//    }
//
//    public static void main(String[] args) {
//        Exception5 demo = new Exception5();
//        demo.getDetails(null);
//    }
//}

//Что происходит
//В метод передаётся null
//Выполняется throw new NullPointerException
//Программа завершается с сообщением об ошибке


public class Exception5 {

    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Key: " + key);

        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Exception5().getDetails(null);
    }
}

//Объяснение
//Исключение перехватывается внутри метода
//Программа не ломается
//Однако это не лучший вариант, так как:
//вызывающий код не узнаёт об ошибке
//лучше обрабатывать исключение выше по стеку