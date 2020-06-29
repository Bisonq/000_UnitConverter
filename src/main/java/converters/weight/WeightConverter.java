package converters.weight;

public class WeightConverter {

    private static WeightConverter weightConverter;

    private WeightConverter(){

    }

    public static WeightConverter getWeightConverter(){
        if(weightConverter == null)
            weightConverter = new WeightConverter();
        return weightConverter;
    }

    public void buildTableOfWeights(double value, WeightUnits typeOfWeightUnit){
        Gram gram = new Gram();
        Decagram decagram = new Decagram();
        Kilogram kilogram = new Kilogram();
        Ton ton = new Ton();

        gram.setHigherUnitInChain(decagram);
        decagram.setHigherUnitInChain(kilogram);
        kilogram.setHigherUnitInChain(ton);

        gram.processRequest(value, typeOfWeightUnit);
    }
}
