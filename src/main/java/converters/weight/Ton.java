package converters.weight;

class Ton extends Unit{

    @Override
    public void processRequest(double value, WeightUnits typeOfWeightUnit) {
        if(typeOfWeightUnit == null)
            throw new IllegalArgumentException("Wrong unit of weight");
        if(typeOfWeightUnit.getSymbol().equals("t"))
            System.out.println(super.printTableOfWeights(value * 1000000, value * 100000, value * 1000, value));
        else
            throw new IllegalArgumentException("End of the chain");
    }
}
