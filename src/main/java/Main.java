import converters.length.LengthConverter;
import converters.length.LengthUnits;
import converters.weight.WeightConverter;
import converters.weight.WeightUnits;

public class Main {

    public static void main(String[] args) {
        WeightConverter weightConverter = WeightConverter.getWeightConverter();
        weightConverter.buildTableOfWeights(10, WeightUnits.KILOGRAM);

        LengthConverter lengthConverter = LengthConverter.getLengthConverter();
        lengthConverter.buildTableOfLengths(10, LengthUnits.KILOMETER);
    }
}
