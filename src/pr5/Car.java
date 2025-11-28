package pr5;

public class Car implements Nameable {
    private final String model;
    private final String brand;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String getName() { return brand + " " + model; }

    @Override
    public String toString() {
        return String.format("Car{brand='%s', model='%s'}", brand, model);
    }
}
