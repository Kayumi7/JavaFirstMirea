package pr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ComputerShop {
    private final String name;
    private final List<Computer> catalog = new ArrayList<>();

    public ComputerShop(String name) {
        this.name = name;
    }

    public void addComputer(Computer c) { catalog.add(c); }

    public boolean removeComputerByName(String name) {
        return catalog.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    // Поиск по имени (brand+model), либо по минимальной/максимальной цене, либо по процессору
    public List<Computer> findByName(String namePart) {
        String q = namePart.toLowerCase(Locale.ROOT);
        List<Computer> res = new ArrayList<>();
        for (Computer c : catalog) {
            if (c.getName().toLowerCase(Locale.ROOT).contains(q)) res.add(c);
        }
        return res;
    }

    public List<Computer> findByPriceRange(double min, double max) {
        List<Computer> res = new ArrayList<>();
        for (Computer c : catalog) {
            if (c.getPrice() >= min && c.getPrice() <= max) res.add(c);
        }
        return res;
    }

    public List<Computer> findByProcessorModel(String modelPart) {
        String q = modelPart.toLowerCase(Locale.ROOT);
        List<Computer> res = new ArrayList<>();
        for (Computer c : catalog) {
            if (c.getProcessor().getModel().toLowerCase(Locale.ROOT).contains(q)) res.add(c);
        }
        return res;
    }

    public void printCatalog() {
        System.out.println("Catalog of " + name + ":");
        if (catalog.isEmpty()) {
            System.out.println("  (empty)");
            return;
        }
        for (int i = 0; i < catalog.size(); i++) {
            System.out.printf(" %d) %s%n", i + 1, catalog.get(i));
        }
    }
}
