public class Length {
    private double value;
    private LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Length convertToSpecialUnit(LengthUnit specialUnit) {
        return new Length(specialUnit.getValueBySpecialUnit(value, unit), specialUnit);

    }

    public Length plus(Length anotherLength) {
        double sum = unit.convertValueAsBaseUnit(value) + anotherLength.unit.convertValueAsBaseUnit(anotherLength.value);
        double resultValue = unit.convertFromBaseUnit(sum);
        return new Length(resultValue, this.unit);
    }

    public Length minus(Length anotherLength) {
        double difference = unit.convertValueAsBaseUnit(value) - anotherLength.unit.convertValueAsBaseUnit(anotherLength.value);
        double resultValue = unit.convertFromBaseUnit(difference);
        return new Length(resultValue, this.unit);
    }

    public Length times(int multiplier) {
        double product = this.value * multiplier;
        return new Length(product, this.unit);
    }

    public Length divide(int divisor) {
        double quotient = this.value / divisor;
        return new Length(quotient, this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (Double.compare(length.unit.convertValueAsBaseUnit(length.value), unit.convertValueAsBaseUnit(value)) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + this.value +
                ", unit=" + unit +
                ", valueAsBaseUnit=" + unit.convertValueAsBaseUnit(value) +
                ", BaseUnit is Millimeter" +
                '}';
    }
}
