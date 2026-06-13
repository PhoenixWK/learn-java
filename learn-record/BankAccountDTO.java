

public record BankAccountDTO(String id, String accountNumber, int code, String accountName) {
	public BankAccountDTO {
		if(!id.matches("AC-\\d{6}")) {
			throw new IllegalArgumentException("Id khong hop le!");
		}

		if(!accountNumber.matches("VW\\d{6}")) {
			throw new IllegalArgumentException("Account number khong hop le!");
		}

		if(code < 100 || code > 999) {
			throw new IllegalArgumentException("Ma cvv khong hop le!");
		}

		if(accountName.length() < 7) {
			throw new IllegalArgumentException("Ten account phai toi thieu 7 ky tu");
		}

	}
}

