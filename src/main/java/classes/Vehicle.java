package classes;

public class Vehicle extends Asset{
    private int year;
    private String make;
    private String model;
    private String condition;

    public Vehicle(String name, String owner, double value, int year, String make, String model, String condition) {
        super(name, owner, value);
        this.year = year;
        this.make = make;
        this.model = model;
        this.condition = condition;
    }
    @Override
    public double getValue(){
        return 3500;
    }
}
