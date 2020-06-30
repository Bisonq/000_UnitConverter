package converters.length;

 class Meter extends Unit{

    @Override
    protected void processRequest(double value, LengthUnits lengthUnits) {
        if(lengthUnits == null)
            throw new IllegalArgumentException("Wrong unit of length");
        if(lengthUnits.getSymbol().equals("m"))
            System.out.println(super.printTableOfLengths(value * 1000, value * 100, value * 10, value, value * 0.001));
        else
            getNextUnitInChain().processRequest(value, lengthUnits);
    }
}
