package converters;

public class WeightConverter {

    private double value;
    private WeightUnits typeOfWeightUnit;

    public WeightConverter(double value, WeightUnits typeOfWeightUnit){
        this.value = value;
        this.typeOfWeightUnit = typeOfWeightUnit;
    }

    public void buildTableOfWeights(){
        if (typeOfWeightUnit.getSymbol().equals("g")){
            System.out.println(printTableOfWeights(value, value * 0.1, value * 0.001, value * 0.000001));
        }
        else if(typeOfWeightUnit.getSymbol().equals("dag")){
            System.out.println(printTableOfWeights(value * 10, value, value * 0.01, value * 0.00001));
        }
        else if(typeOfWeightUnit.getSymbol().equals("kg")){
            System.out.println(printTableOfWeights(value * 1000, value * 100, value, value * 0.001));
        }
        else if (typeOfWeightUnit.getSymbol().equals("t")){
            System.out.println(printTableOfWeights(value * 1000000, value * 100000, value * 1000, value));
        }
    }

    private String printTableOfWeights(double gram, double decagram, double kilogram, double ton){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Gram: ").append(gram).append("\n");
        stringBuilder.append("Decagram: ").append(decagram).append("\n");
        stringBuilder.append("Kilogram: ").append(kilogram).append("\n");
        stringBuilder.append("Tom: ").append(ton).append("\n");
        return stringBuilder.toString();
    }
}
