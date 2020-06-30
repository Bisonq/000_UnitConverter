package converters.length;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthUnitsTest {

    @Test
    @DisplayName("Decimeter unit should have 'dcm' simbol")
    void test1(){
        //given
        String symbol = LengthUnits.DECIMETER.getSymbol();

        //then
        assertEquals("dcm", symbol);
    }

    @Test
    @DisplayName("Centimeter unit should have 'cm' simbol")
    void test2(){
        //given
        String symbol = LengthUnits.CENTIMETER.getSymbol();

        //then
        assertEquals("cm", symbol);
    }

    @Test
    @DisplayName("Kilometer unit should have 'km' simbol")
    void test3(){
        //given
        String symbol = LengthUnits.KILOMETER.getSymbol();

        //then
        assertEquals("km", symbol);
    }

    @Test
    @DisplayName("Meter unit should have 'm' simbol")
    void test4(){
        //given
        String symbol = LengthUnits.METER.getSymbol();

        //then
        assertEquals("m", symbol);
    }

    @Test
    @DisplayName("Millimeter unit should have 'mm' simbol")
    void test5(){
        //given
        String symbol = LengthUnits.MILLIMETER.getSymbol();

        //then
        assertEquals("mm", symbol);
    }

}