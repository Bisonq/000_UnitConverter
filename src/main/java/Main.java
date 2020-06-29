import converters.WeightConverter;
import converters.WeightUnits;

public class Main {

    public static void main(String[] args) {
        WeightConverter weightConverter = new WeightConverter(25000, WeightUnits.TON);
        weightConverter.buildTableOfWeights();
    }

}
