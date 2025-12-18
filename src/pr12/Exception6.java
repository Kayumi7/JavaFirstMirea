package pr12;

//public class Exception6 {
//
//    public void printMessage(String key) {
//        String message = getDetails(key);
//        System.out.println(message);
//    }
//
//    public String getDetails(String key) {
//        if (key == null) {
//            throw new NullPointerException("null key in getDetails");
//        }
//        return "data for " + key;
//    }
//
//    public static void main(String[] args) {
//        Exception6 demo = new Exception6();
//        demo.printMessage(null);
//    }
//}

//Что происходит
//getDetails() выбрасывает исключение
//printMessage() не обрабатывает его
//Исключение передаётся выше
//Программа аварийно завершается


public class Exception6 {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exception6 demo = new Exception6();
        demo.printMessage(null);
        demo.printMessage("Java");
    }
}

//Объяснение поведения
//Исключение пробрасывается из getDetails
//Перехватывается в printMessage
//Программа:
//не завершается
//продолжает работу
//Это правильный подход к обработке ошибок