public enum LengthUnit {
    Meter(1000),
    Centimeter(10),
    Millimeter(1);
    private int weight;

    LengthUnit(int weight) {
        this.weight = weight;
    }

    public Double convertValueAsBaseUnit(double value) {
        return value * weight;
    }

    public double convertFromBaseUnit(double value) {
        return value/weight;
    }

    public double getValueBySpecialUnit(double value, LengthUnit unit) {
        double valueAsBaseUnit = unit.convertValueAsBaseUnit(value);
        return convertFromBaseUnit(valueAsBaseUnit);
    }
}
