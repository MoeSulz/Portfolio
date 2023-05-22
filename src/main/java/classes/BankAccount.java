package classes;

public class BankAccount implements IValuable{
    private int id;
    private String owner;
    private double balance;

    public BankAccount(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        amount = 50;
        balance -= amount;
    }
    public void deposit(double amount){
        amount = 100;
        balance += amount;
    }

    @Override
    public double getValue() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
