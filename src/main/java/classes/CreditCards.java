package classes;

public class CreditCards implements IValuable{
    private String cardNumber;
    private double balance;

    public CreditCards(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void charge(double amount){
        amount = 100;
        amount += balance;
    }
    public void pay(double amount){
        amount = 75;
        amount -= balance;
    }
    @Override
    public double getValue(){
        return balance;
    }
}
