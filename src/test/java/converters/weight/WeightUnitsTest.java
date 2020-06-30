package converters.weight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightUnitsTest {

    @Test
    @DisplayName("Gram unit should have 'g' symbol")
    void test1(){
        //given
        String symbol = WeightUnits.GRAM.getSymbol();

        //then
        assertEquals("g", symbol);
    }

    @Test
    @DisplayName("Decagram unit should have 'deg' symbol")
    void test2(){
        //given
        String symbol = WeightUnits.DECAGRAM.getSymbol();

        //then
        assertEquals("dag", symbol);
    }

    @Test
    @DisplayName("Kilogram unit should have 'kg' symbol")
    void test3(){
        //given
        String symbol = WeightUnits.KILOGRAM.getSymbol();

        //then
        assertEquals("kg", symbol);
    }

    @Test
    @DisplayName("Ton unit should have 't' symbol")
    void test4(){
        //given
        String symbol = WeightUnits.TON.getSymbol();

        //then
        assertEquals("t", symbol);
    }

}