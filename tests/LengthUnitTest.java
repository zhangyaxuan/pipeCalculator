import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LengthUnitTest {
    @Test
    public void shouldGive1MeterConvertTo1000Millimeter() {
        assertThat(LengthUnit.Meter.convertValueAsBaseUnit(1.0), is(1000.0));
    }

    @Test
    public void shouldGive2DotFiveMeterConvertTo2500Millimeter() {
        assertThat(LengthUnit.Meter.convertValueAsBaseUnit(2.5), is(2500.0));
    }

    @Test
    public void shouldGive4CentimeterConvertTo40Millimeter() {
        assertThat(LengthUnit.Centimeter.convertValueAsBaseUnit(4.0), is(40.0));
    }

    @Test
    public void shouldGive1MillimeterConvertTo1Millimeter() {
        assertThat(LengthUnit.Millimeter.convertValueAsBaseUnit(1.0), is(1.0));
    }
}
