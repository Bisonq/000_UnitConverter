package converters.weight;

class Decagram extends Unit{

    @Override
    public void processRequest(double value, WeightUnits typeOfWeightUnit) {
        if(typeOfWeightUnit == null)
            throw new IllegalArgumentException("Wrong unit of weight");
        if(typeOfWeightUnit.getSymbol().equals("dag"))
            System.out.println(printTableOfWeights(value * 10, value, value * 0.01, value * 0.00001));
        else
            getHigherUnitInChain().processRequest(value, typeOfWeightUnit);
    }
}
