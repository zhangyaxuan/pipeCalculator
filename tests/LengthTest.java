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

    @Test
    public void should1MeterEquals100Centimeter() {
        Length oneMeter = new Length(1.0, LengthUnit.Meter);
        Length oneHundredCentimeter = new Length(100.0, LengthUnit.Centimeter);

        assertThat(oneMeter, is(oneHundredCentimeter));
    }

    @Test
    public void shouldGive1CentimeterReturn0Dot01Meter() {
        Length oneCentimeter = new Length(1.0, LengthUnit.Centimeter);
        Length zeroDotZeroOneMeter = new Length(0.01, LengthUnit.Meter);
        assertThat(oneCentimeter.convertToSpecialUnit(LengthUnit.Meter), is(zeroDotZeroOneMeter));
    }


    @Test
    public void shouldGive2MillimeterReturn0Dot2Centimeter() {
        Length zeroDotTwoCentimeter = new Length(0.2, LengthUnit.Centimeter);
        Length twoMillimeter = new Length(2.0, LengthUnit.Millimeter);
        assertThat(twoMillimeter.convertToSpecialUnit(LengthUnit.Centimeter), is(zeroDotTwoCentimeter));
    }

    @Test
    public void shouldGive2MeterReturnCorrectLengthWithSpecialUnit() {
        Length twoMeter = new Length(2.0, LengthUnit.Meter);
        Length twoHundredCentimeter = new Length(200.0, LengthUnit.Centimeter);
        Length twoThousandMillimeter = new Length(2000.0, LengthUnit.Millimeter);

        assertThat(twoMeter.convertToSpecialUnit(LengthUnit.Centimeter), is(twoHundredCentimeter));
        assertThat(twoMeter.convertToSpecialUnit(LengthUnit.Millimeter), is(twoThousandMillimeter));
        assertThat(twoMeter.convertToSpecialUnit(LengthUnit.Meter), is(twoMeter));
    }
}
