package pr5;

public class Processor {
    private final String model;
    private final double frequencyGHz; // ГГц
    private final int cores;

    public Processor(String model, double frequencyGHz, int cores) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.cores = cores;
    }

    public String getModel() { return model; }
    public double getFrequencyGHz() { return frequencyGHz; }
    public int getCores() { return cores; }

    @Override
    public String toString() {
        return String.format("%s %.2fGHz %d-core", model, frequencyGHz, cores);
    }
}
