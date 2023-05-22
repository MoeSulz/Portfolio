package classes;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        IValuable account2 = new BankAccount(456, "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(100);

        account1.withdraw(300);
        ((BankAccount) account2).withdraw(100);

        System.out.println(account1);
        System.out.println(account2);
    }
}
