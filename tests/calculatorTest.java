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
    public void should1MeterEquals100Centimeter() throws Exception {
        Meter oneMeter = new Meter(1);
        Centimeter oneHundredCentimeter = new Centimeter(100);
        assertThat(oneMeter.toCentimeter(), is(oneHundredCentimeter));
    }

    @Test
    public void should1MeterAdd1MeterIs2Meter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length twoMeter = new Length(2.0, LengthUnit.Meter);
        assertThat(oneMeter.plus(oneMeter), is(twoMeter));
    }

    @Test
    public void should1MeterAdd20CentimeterIs1Dot2Meter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length twentyCentimeter = new Length(20.0, LengthUnit.Centimeter);
        Length oneDotTwoMeter =  new Length(1.2, LengthUnit.Meter);
        assertThat(oneMeter.plus(twentyCentimeter), is(oneDotTwoMeter));
    }

    @Test
    public void should1MeterMinus20CentimeterIs0Dot8Meter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length twentyCentimeter = new Length(20.0, LengthUnit.Centimeter);
        Length oneDotTwoMeter =  new Length(0.8, LengthUnit.Meter);
        assertThat(oneMeter.minus(twentyCentimeter), is(oneDotTwoMeter));
    }

    @Test
    public void should2MeterTimes4Is8Meter() {
        Length twoMeter = new Length(2.0, LengthUnit.Meter);
        Length eightMeter =  new Length(8.0, LengthUnit.Meter);
        assertThat(twoMeter.times(4), is(eightMeter));
    }

    @Test
    public void should8MeterDivide4Is2Meter() {
        Length twoMeter = new Length(2.0, LengthUnit.Meter);
        Length eightMeter =  new Length(8.0, LengthUnit.Meter);
        assertThat(eightMeter.divide(4), is(twoMeter));
    }

    //1m/4+10cm*3-50mm=250+300-50=500mm=0.5m
    @Test
    public void should1MeterDivide4ThenplusTenCentiMiterTimes3ThenMinus50MillimeterIsZeroDotFiveMeter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length tenCentimeter = new Length(10.0, LengthUnit.Centimeter);
        Length fiftyMillimeter = new Length(50.0, LengthUnit.Millimeter);
        Length zeroDotFiveMeter = new Length(0.5, LengthUnit.Meter);
        assertThat(oneMeter.divide(4).plus(tenCentimeter.times(3)).minus(fiftyMillimeter),is(zeroDotFiveMeter));

    }
}
