package converters.weight;

public enum WeightUnits {
    GRAM("g"), DECAGRAM("dag"), KILOGRAM("kg"), TON("t");

    private String symbol;

    WeightUnits(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
