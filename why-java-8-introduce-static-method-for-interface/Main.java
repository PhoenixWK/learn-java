



public class Main {
	public static void main(String[] args) {
		Account acc = Account.create("SAVING", 1_000_000);
		boolean valid = Account.isValidAccountNumber("0123456789");
		System.out.println(acc);
		System.out.println(valid);
	}
}
