package pr5;

public class Monitor {
    private final double diagonalInch;
    private final String resolution; // e.g. 1920x1080

    public Monitor(double diagonalInch, String resolution) {
        this.diagonalInch = diagonalInch;
        this.resolution = resolution;
    }

    public double getDiagonalInch() { return diagonalInch; }
    public String getResolution() { return resolution; }

    @Override
    public String toString() {
        return String.format("%.1f\" %s", diagonalInch, resolution);
    }
}
