
public interface Account {
	void deposit(double amount);
	double getBalance();

	static boolean isValidAccountNumber (String accountNumber) {
		return !accountNumber.isEmpty() && accountNumber.matches("\\d{10}");
	}

	//Factory method
	static Account create(String type, double initialBalance) {
		return switch(type) {
			case "SAVING" -> new SavingsAccount(initialBalance);
			case "CHECKING" -> new CheckingAccount(initialBalance);
			default -> throw new IllegalArgumentException();
		};
	}

}
