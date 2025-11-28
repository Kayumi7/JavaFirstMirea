package pr5;

public class Computer implements Nameable, Priceable {
    private final Brand brand;
    private final String model;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;
    private final double price;

    public Computer(Brand brand, String model, Processor processor, Memory memory, Monitor monitor, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    @Override
    public String getName() {
        return brand + " " + model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public Brand getBrand() { return brand; }
    public String getModel() { return model; }
    public Processor getProcessor() { return processor; }
    public Memory getMemory() { return memory; }
    public Monitor getMonitor() { return monitor; }

    @Override
    public String toString() {
        return String.format("%s %s — %s, %s, %s — Цена: %.2f",
                brand, model, processor, memory, monitor, price);
    }
}
