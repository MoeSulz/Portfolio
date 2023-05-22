package classes;

public class Jewelry extends Asset{
    private double karat;

    public Jewelry(String name, String owner, double value, double karat) {
        super(name, owner, value);
        this.karat = karat;
    }
    @Override
    public double getValue(){
        return 500;
    }
}
