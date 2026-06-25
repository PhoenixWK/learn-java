public class SavingAccount implements Account {
    private double balance;
    SavingsAccount(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
}

