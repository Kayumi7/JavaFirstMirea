package pr5;

public class Planet implements Nameable {
    private final String name;
    private final double mass; // пример дополнительного поля

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("Planet{name='%s', mass=%s}", name, mass);
    }
}
