package converters.units;

import converters.WeightUnits;

abstract class Unit {
    private Unit nextUnitInChain;

    public abstract void processRequest(double value, WeightUnits typeOfWeightUnit);

    public void setHigherUnitInChain(Unit unit){
        this.nextUnitInChain = unit;
    }
    public Unit getHigherUnitInChain(){
        return this.nextUnitInChain;
    }

    protected String printTableOfWeights(double gram, double decagram, double kilogram, double ton){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Gram: ").append(gram).append("\n");
        stringBuilder.append("Decagram: ").append(decagram).append("\n");
        stringBuilder.append("Kilogram: ").append(kilogram).append("\n");
        stringBuilder.append("Tom: ").append(ton).append("\n");
        return stringBuilder.toString();
    }
}