
public class CheckingAccount implements Account {
    private double balance;
    CheckingAccount(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
}

