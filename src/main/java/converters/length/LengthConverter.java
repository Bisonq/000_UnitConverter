package converters.length;

public class LengthConverter {
    private static LengthConverter lengthConverter;

    private LengthConverter(){

    }

    public static LengthConverter getLengthConverter(){
        if (lengthConverter == null)
            lengthConverter = new LengthConverter();
        return lengthConverter;
    }

    public void buildTableOfLengths(double value, LengthUnits lengthUnits){
        Millimeter millimeter = new Millimeter();
        Centimeter centimeter = new Centimeter();
        Decimeter decimeter = new Decimeter();
        Meter meter = new Meter();
        Kilometer kilometer = new Kilometer();

        millimeter.setNextUnitInChain(centimeter);
        centimeter.setNextUnitInChain(decimeter);
        decimeter.setNextUnitInChain(meter);
        meter.setNextUnitInChain(kilometer);

        millimeter.processRequest(value, lengthUnits);
    }
}
