import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should1MeterLengthEquals1MeterLength() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length anotherMeter = new Length(1.0, LengthUnit.Meter);
        assertThat(oneMeter, is(anotherMeter));
    }

    @Test
    public void should1MeterEquals1000Millimeter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length oneThousandMillimeter = new Length(1000.0, LengthUnit.Millimeter);

        assertThat(oneMeter, is(oneThousandMillimeter));
    }

}
