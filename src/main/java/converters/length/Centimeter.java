package converters.length;

 class Centimeter extends Unit{

    @Override
    protected void processRequest(double value, LengthUnits lengthUnits) {
        if(lengthUnits == null)
            throw new IllegalArgumentException("Wrong unit of length");
        if(lengthUnits.getSymbol().equals("cm"))
            System.out.println(super.printTableOfLengths(value * 10, value, value * 0.1, value * 0.01, value * 0.00001));
        else
            getNextUnitInChain().processRequest(value, lengthUnits);
    }
}
