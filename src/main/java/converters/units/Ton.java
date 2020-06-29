package converters.units;

import converters.WeightUnits;

public class Ton extends Unit{

    @Override
    public void processRequest(double value, WeightUnits typeOfWeightUnit) {
        if(typeOfWeightUnit.getSymbol().equals("t"))
            System.out.println(super.printTableOfWeights(value * 1000000, value * 100000, value * 1000, value));
        else
            throw new IllegalArgumentException();
    }
}
