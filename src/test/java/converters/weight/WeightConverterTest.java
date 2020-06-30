package converters.weight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightConverterTest {

    @Test
    @DisplayName("WeightConverter Should have benn singleton")
    void test1(){
        //given
        WeightConverter weightConverter1 = WeightConverter.getWeightConverter();
        WeightConverter weightConverter2 = WeightConverter.getWeightConverter();

        //then
        assertSame(weightConverter1, weightConverter2);
    }

    @Test
    @DisplayName("buildTable method should throw IllegalArgumentException when WeightUnits is null")
    void test2(){
        //given
        WeightConverter weightConverter = WeightConverter.getWeightConverter();

        //then
        assertThrows(IllegalArgumentException.class, () -> weightConverter.buildTableOfWeights(10, null));
    }

    @Test
    @DisplayName("buildTable method should not throw IllegalArgumentException when WeightUnits is not null")
    void test3(){
        //given
        WeightConverter weightConverter = WeightConverter.getWeightConverter();

        //then
        assertDoesNotThrow(() -> weightConverter.buildTableOfWeights(10, WeightUnits.TON));
    }
}