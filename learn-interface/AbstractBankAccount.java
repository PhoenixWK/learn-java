

public abstract class AbstractBankAccount {
	private int id;
	private String bankAccountName;
	private String bankAccountNumber;
	private String cvvCode;
	private BankAccountType type;

	public AbstractBankAccount(int id, String bankAccountName, String bankAccountNumber, String cvvCode, BankAccountType type) {
		this.id = id;
		this.bankAccountName = bankAccountName;
		this.bankAccountNumber = bankAccountNumber;
		this.cvvCode = cvvCode;
	}

	public int getId() {return this.id;}
	public String getBankAccountName() {return this.bankAccountName;}
	public String getBankAccountNumber() {return this.bankAccountNumber;}
	public String getCvvCode() {return this.cvvCode;}
	public BankAccountType getBankAccountType() {return this.type;}

}
