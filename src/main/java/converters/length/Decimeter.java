package converters.length;

 class Decimeter extends Unit{

    @Override
    protected void processRequest(double value, LengthUnits lengthUnits) {
        if(lengthUnits == null)
            throw new IllegalArgumentException("Wrong unit of length");
        if(lengthUnits.getSymbol().equals("dcm"))
            System.out.println(super.printTableOfLengths(value * 100, value * 10, value, value * 0.1, value * 0.0001));
        else
            getNextUnitInChain().processRequest(value, lengthUnits);
    }
}
