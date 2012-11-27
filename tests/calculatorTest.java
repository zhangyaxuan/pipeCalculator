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
        Meter oneMeter = new Meter(1);
        Meter twoMeter = new Meter(2);
        assertThat(oneMeter.add(oneMeter), is(twoMeter));
    }

    @Test
    public void should1MeterEquals100Centimeter() throws Exception {
        Meter oneMeter = new Meter(1);
        Centimeter oneHundredCentimeter = new Centimeter(100);
        assertThat(oneMeter.toCentimeter(), is(oneHundredCentimeter));
    }
}
