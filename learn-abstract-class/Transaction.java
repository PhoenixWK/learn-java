
import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Transaction {
	private String id;
	private String sourceAccountNumber;
	private String targetAccountNumber;
	private BigDecimal amount;
	private TransactionType transactionType;
	private ZonedDateTime createdAt;

	public Transaction(String id, String soureAccountNumber, String targetAccountNumber, BigDecimal amount, ZonedDateTime createdAt, TransactionType transactionType) {
		this.id = id;
		this.sourceAccountNumber = sourceAccountNumber;
		this.targetAccountNumber = targetAccountNumber;
		this.amount = amount;
		this.transactionType = transactionType;
		this.createdAt = createdAt;
	}

	public String getId() {
		return this.id;
	}

	public String getSourceAccountNumber() {
		return this.sourceAccountNumber;
	}

	public String getTargetAccountNumber() {
		return this.targetAccountNumber;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public ZonedDateTime getCreatedAt() {
		return this.createdAt;
	}

	public TransactionType getTransactionType() {
		return this.transactionType;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSourceAccountNumber( String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

		public void getTargetAccountNumber( String targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}

	public void setAmount( BigDecimal amount) {
		this.amount = amount;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public static String generateId() {
		StringBuilder code = new StringBuilder("ID");

		for(int i = 0; i < 4; i++) {
			code.append(Math.random() * 10);
		}

		return code.toString();
	}

}
