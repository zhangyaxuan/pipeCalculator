public class Meter {
    private int value;

    public Meter(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;

        if (value != meter.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public Meter add(Meter meter) {
        value += meter.value;
        return this;
    }

    public Centimeter toCentimeter() {
        int centimeterValue = value * 100;
        return new Centimeter(centimeterValue);
    }
}
