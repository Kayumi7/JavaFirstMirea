package pr5;

public class Memory {
    private final int sizeGb;
    private final String type; // e.g. DDR4

    public Memory(int sizeGb, String type) {
        this.sizeGb = sizeGb;
        this.type = type;
    }

    public int getSizeGb() { return sizeGb; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return String.format("%dGB %s", sizeGb, type);
    }
}
