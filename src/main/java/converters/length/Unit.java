package converters.length;

 abstract class Unit {
    private Unit nextUnitInChain;

    protected abstract void processRequest(double value, LengthUnits lengthUnits);

    protected void setNextUnitInChain(Unit unit){
        this.nextUnitInChain = unit;
    }

    protected Unit getNextUnitInChain() {
        return this.nextUnitInChain;
    }

    protected String printTableOfLengths(double millimeter, double centimeter, double decimeter, double meter, double kilometer){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Length Units: ").append("\n");
        stringBuilder.append("Millimeter: ").append(millimeter).append("\n");
        stringBuilder.append("Centimeter: ").append(centimeter).append("\n");
        stringBuilder.append("Decimeter: ").append(decimeter).append("\n");
        stringBuilder.append("Meter: ").append(meter).append("\n");
        stringBuilder.append("Kilometer: ").append(kilometer).append("\n");
        return stringBuilder.toString();
    }
}
