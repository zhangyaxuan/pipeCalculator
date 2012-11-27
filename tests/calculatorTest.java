import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class calculatorTest {
    @Test
    public void should1MeterEquals1Meter(){
        Meter oneMeter = new Meter(1);
        Meter anotherOneMeter = new Meter(1);
        assertThat(oneMeter, is(anotherOneMeter));
    }

    @Test
    public void should1MeterAdd1MeterIs2Meter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length twoMeter = new Length(2.0, LengthUnit.Meter);
        assertThat(oneMeter.plus(oneMeter), is(twoMeter));
    }

    @Test
    public void should1MeterEquals100Centimeter() throws Exception {
        Meter oneMeter = new Meter(1);
        Centimeter oneHundredCentimeter = new Centimeter(100);
        assertThat(oneMeter.toCentimeter(), is(oneHundredCentimeter));
    }
}
