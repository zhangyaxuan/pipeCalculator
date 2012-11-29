public class Length {
    private double value;
    private LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private Double toBaseUnit(){
        return unit.convertValueAsBaseUnit(value);
    }

    public Length convertToSpecialUnit(LengthUnit specialUnit) {
        double valueAsBaseUnit = this.toBaseUnit();
        double resultValue = convertFromBaseUnit(valueAsBaseUnit, specialUnit);
        return new Length(resultValue, specialUnit);

    }

    private double convertFromBaseUnit(double value, LengthUnit unit) {
        return unit.convertFromBaseUnit(value);
    }

    public Length plus(Length anotherLength) {
        double sum = this.toBaseUnit() + anotherLength.toBaseUnit();
        double resultValue = this.convertFromBaseUnit(sum, this.unit);
        return new Length(resultValue, this.unit);
    }

    public Length minus(Length anotherLength) {
        double difference = this.toBaseUnit() - anotherLength.toBaseUnit();
        double resultValue = this.convertFromBaseUnit(difference, this.unit);
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

        if (Double.compare(length.toBaseUnit(), this.toBaseUnit()) != 0) return false;

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
                ", valueAsBaseUnit=" + this.toBaseUnit() +
                ", BaseUnit is Millimeter" +
                '}';
    }
}
