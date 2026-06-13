import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Account extends AbstractBankAccountMethod {
	private String id;
	private String accountNumber;
	private String accountName;
	private int cvv;
	private BigDecimal balance;

	public Account(String accountNumber, String accountName, int cvv, BigDecimal balance) {
		this.id = Account.generateId();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.cvv = cvv;
		this.balance = balance;
	}

	public String getId() {return this.id;}
	public String getAccountNumber() {return this.accountNumber;}
	public String getAccountName() {return this.accountName;}
	public int getCvv() {return this.cvv = cvv;}
	public BigDecimal getBalance() {return this.balance = balance;}

	public void setId(String id) {this.id = id;}
	public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
	public void setAccountName(String accountName) {this.accountName = accountName;}
	public void setCvv(int cvv) {this.cvv = cvv;}
	public void setBalance(BigDecimal balance) {this.balance = balance;}

	@Override
	public String deposit(BigDecimal amount) {
		if(amount.compareTo(BigDecimal.valueOf(10000)) < 0) {
			System.out.println("Can nap toi thieu 10000");
			return "GIAO DICH THAT BAI";
		}
		this.balance = this.balance.add(amount);

		Transaction newTransaction = new Transaction(Transaction.generateId(), null, this.accountNumber, amount, ZonedDateTime.now(),  TransactionType.DEPOSIT);

		return newTransaction.toString();
	}

	@Override
	public String withdraw(BigDecimal amount) {

		if(amount.compareTo(BigDecimal.valueOf(10000)) < 0) {
			System.out.println("Can rut toi thieu 10000");
			return "GIAO DICH THAT BAI";
		}

		if(amount.compareTo(this.balance) > 0) throw new IllegalArgumentException("So tien khong du de rut");

		Transaction newTransaction = new Transaction(Transaction.generateId(), this.accountName, null, amount, ZonedDateTime.now(), TransactionType.WITHDRAW);

		return newTransaction.toString();
	}

	@Override
	public String transfer(Account targetAccount, BigDecimal amount) {
		if(amount.compareTo(BigDecimal.valueOf(10000)) < 0) {
			System.out.println("Can giao dich toi thieu 10000");
			return "GIAO DICH THAT BAI";
		}

		if(amount.compareTo(this.balance) > 0) {
			System.out.println("Tai khoan khong du tien giao dich");
			return "GIAO DICH THAT BAI";
		}

		this.balance = this.balance.subtract(amount);
		targetAccount.setBalance(targetAccount.getBalance().add(amount));

		Transaction newTransaction = new Transaction(Transaction.generateId(), this.accountName, targetAccount.accountName, amount, ZonedDateTime.now(), TransactionType.TRANSFER);

		return newTransaction.toString();
	}

	public static String generateId() {
		StringBuilder id = new StringBuilder("#");

		for(int i = 0; i < 4; i++) {
			id.append(Math.random() * 10);
		}

		return id.toString();
	}
}
