package classes;

public class Gold extends Asset{
    private double weight;

    public Gold(String name, String owner, double value, double weight) {
        super(name, owner, value);
        this.weight = weight;
    }
    @Override
    public double getValue(){
        return 1000;
    }
}
