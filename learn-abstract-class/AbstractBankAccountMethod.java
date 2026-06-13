import java.math.BigDecimal;



public abstract class AbstractBankAccountMethod {

	public abstract String deposit(BigDecimal amount);
	public abstract String withdraw(BigDecimal amount);
	public abstract String transfer(Account targetAccount, BigDecimal amount);

}
