import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * NormalBankAccount
 */
public class NormalBankAccount extends Account {
	private AccountType accountType;

	public NormalBankAccount(AccountType accountTyp, String accountNumber, String accountName, int cvv, BigDecimal balance) {
		super(accountNumber, accountName, cvv, balance);
		this.accountType = accountType;
	}

	public AccountType getAccountType() {return this.accountType = accountType;}
	public void setAccountType(AccountType newAccountType) {this.accountType = accountType;}
}
