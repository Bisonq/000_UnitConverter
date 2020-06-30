package converters.length;

 class Millimeter extends Unit{

    @Override
    protected void processRequest(double value, LengthUnits lengthUnits) {
        if(lengthUnits == null)
            throw new IllegalArgumentException("Wrong unit of length");
        if(lengthUnits.getSymbol().equals("mm"))
            System.out.println(super.printTableOfLengths(value, value * 0.1, value * 0.01, value * 0.001, value * 0.000001));
        else
            getNextUnitInChain().processRequest(value, lengthUnits);
    }
}
