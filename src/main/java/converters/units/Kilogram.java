package converters.units;

import converters.WeightUnits;

public class Kilogram extends Unit{

    @Override
    public void processRequest(double value, WeightUnits typeOfWeightUnit) {
        if(typeOfWeightUnit.getSymbol().equals("kg"))
            System.out.println(super.printTableOfWeights(value * 1000, value * 100, value, value * 0.001));
        else
            getHigherUnitInChain().processRequest(value, typeOfWeightUnit);
    }
}
