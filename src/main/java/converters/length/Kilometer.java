package converters.length;

 class Kilometer extends Unit{

    @Override
    protected void processRequest(double value, LengthUnits lengthUnits) {
        if(lengthUnits == null)
            throw new IllegalArgumentException("Wrong unit of length");
        if(lengthUnits.getSymbol().equals("km"))
            System.out.println(super.printTableOfLengths(value * 1000000, value * 100000, value * 10000, value * 1000, value));
        else
            throw new IllegalArgumentException("End of the chain");
    }
}
