package pr5;

public class Animal implements Nameable {
    private final String name;
    private final String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("Animal{name='%s', species='%s'}", name, species);
    }
}
