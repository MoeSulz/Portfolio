package classes;

public abstract class Asset implements IValuable{
    private double value;

    public Asset(String name, String owner, double value) {
        this.value = value;
    }
    @Override
    public double getValue(){
        return value;
    }
}
