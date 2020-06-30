package converters.weight;

abstract class Unit {
    private Unit nextUnitInChain;

    protected abstract void processRequest(double value, WeightUnits typeOfWeightUnit);

    protected void setHigherUnitInChain(Unit unit){
        this.nextUnitInChain = unit;
    }

    protected Unit getHigherUnitInChain(){
        return this.nextUnitInChain;
    }

    protected String printTableOfWeights(double gram, double decagram, double kilogram, double ton){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Weight Units: ").append("\n");
        stringBuilder.append("Gram: ").append(gram).append("\n");
        stringBuilder.append("Decagram: ").append(decagram).append("\n");
        stringBuilder.append("Kilogram: ").append(kilogram).append("\n");
        stringBuilder.append("Tom: ").append(ton).append("\n");
        return stringBuilder.toString();
    }
}