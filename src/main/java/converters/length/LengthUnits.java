package converters.length;

public enum LengthUnits {
    KILOMETER("km"), METER("m"), DECIMETER("dcm"), CENTIMETER("cm"), MILLIMETER("mm");

    private String symbol;

    LengthUnits(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
