package pr5;

public class TemperatureConverter implements ConvertableTemperature {
    @Override
    public double convert(double value, Unit from, Unit to) {
        // приводим сначала к Цельсию
        double c;
        switch (from) {
            case CELSIUS:
                c = value; break;
            case KELVIN:
                c = value - 273.15; break;
            case FAHRENHEIT:
                c = (value - 32) * 5.0 / 9.0; break;
            default:
                throw new IllegalArgumentException("Unknown unit");
        }

        // затем в целевой
        switch (to) {
            case CELSIUS:
                return c;
            case KELVIN:
                return c + 273.15;
            case FAHRENHEIT:
                return c * 9.0 / 5.0 + 32;
            default:
                throw new IllegalArgumentException("Unknown unit");
        }
    }
}
