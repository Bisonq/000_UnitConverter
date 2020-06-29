package converters.weight;

class Gram extends Unit{

    @Override
    public void processRequest(double value, WeightUnits typeOfWeightUnit) {
        if(typeOfWeightUnit.getSymbol().equals("g"))
            System.out.println(super.printTableOfWeights(value, value * 0.1, value * 0.001, value * 0.000001));
        else
            getHigherUnitInChain().processRequest(value, typeOfWeightUnit);
    }
}
