package converters.length;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    @Test
    @DisplayName("LengthConverter should have been singleton")
    void test1(){
        //given
        LengthConverter lengthConverter1 = LengthConverter.getLengthConverter();
        LengthConverter lengthConverter2 = LengthConverter.getLengthConverter();

        //then
        assertSame(lengthConverter1, lengthConverter2);
    }

    @Test
    @DisplayName("buildTable method should throw IllegalArgumentException when LengthUnits is null")
    void test2(){
        //given
        LengthConverter lengthConverter = LengthConverter.getLengthConverter();

        //then
        assertThrows(IllegalArgumentException.class, () -> lengthConverter.buildTableOfLengths(10, null));
    }

    @Test
    @DisplayName("buildTable method should not throw IllegalArgumentException when LengthUnit is not null")
    void test3(){
        //given
        LengthConverter lengthConverter = LengthConverter.getLengthConverter();

        //then
        assertDoesNotThrow(() -> lengthConverter.buildTableOfLengths(10, LengthUnits.KILOMETER));
    }
}