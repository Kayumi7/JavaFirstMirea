package pr5;

import java.util.List;
import java.util.Scanner;

public class TestMain3 {
    public static void main(String[] args) {
        // ====== 10. ComputerShop demo (ввод с клавиатуры) ======
        Scanner sc = new Scanner(System.in);
        ComputerShop shop = new ComputerShop("MyComputerStore");

        System.out.println("Добавим 2 компьютера (пример ввода):");
        // Пример: добавим вручную 2 компьютера (в реале можно считывать динамически)
        Computer c1 = new Computer(Brand.DELL, "Inspiron15",
                new Processor("Intel i5-1135G7", 2.4, 4),
                new Memory(16, "DDR4"),
                new Monitor(15.6, "1920x1080"),
                799.99);
        Computer c2 = new Computer(Brand.ASUS, "VivoBook",
                new Processor("AMD Ryzen 5 5600U", 2.3, 6),
                new Memory(8, "DDR4"),
                new Monitor(14.0, "1920x1080"),
                649.50);

        shop.addComputer(c1);
        shop.addComputer(c2);

        shop.printCatalog();

        System.out.println("\nПоиск по процессору 'Ryzen':");
        List<Computer> found = shop.findByProcessorModel("Ryzen");
        for (Computer fc : found) System.out.println(" -> " + fc);

        System.out.println("\nУдаляем 'ASUS VivoBook'...");
        boolean removed = shop.removeComputerByName("ASUS VivoBook");
        System.out.println("Removed: " + removed);
        shop.printCatalog();

        // ====== 11. TemperatureConverter demo ======
        System.out.println("\n=== Temperature conversions ===");
        TemperatureConverter tc = new TemperatureConverter();
        double celsius = 25.0;
        double kelvin = tc.convert(celsius, Unit.CELSIUS, Unit.KELVIN);
        double fahrenheit = tc.convert(celsius, Unit.CELSIUS, Unit.FAHRENHEIT);
        System.out.printf("%.2f °C = %.2f K = %.2f °F%n", celsius, kelvin, fahrenheit);

        // ====== 12. UndoableStringBuilder demo ======
        System.out.println("\n=== UndoableStringBuilder demo ===");
        UndoableStringBuilder usb = new UndoableStringBuilder();
        usb.append("Hello");
        usb.append(", world");
        System.out.println("After appends: " + usb);
        usb.delete(5, 7); // remove ", "
        System.out.println("After delete: " + usb);
        usb.undo();
        System.out.println("After undo: " + usb);
        usb.undo();
        System.out.println("After undo 2: " + usb);

        // ====== 13. ObservableStringBuilder demo ======
        System.out.println("\n=== ObservableStringBuilder demo ===");
        ObservableStringBuilder osb = new ObservableStringBuilder();
        osb.addListener(s -> System.out.println("[Listener1] new value: " + s));
        osb.addListener(s -> System.out.println("[Listener2] length=" + s.length()));
        osb.append("A");
        osb.append("BC");
        osb.insert(1, "-");
        osb.delete(0, 1);

        System.out.println("\nВсе демо завершено.");
    }
}
