

public class BasicBankAccount extends AbstractBankAccount implements BankAccountMethod  {

	public BasicBankAccount(int id, String bankAccountName, String bankAccountNumber, String cvvCode) {
		super(id, bankAccountName, bankAccountNumber, cvvCode, BankAccountType.BASIC);
	}

	public void deposit() {

	}

	public void transfer() {}

	public void withdraw() {}
}
