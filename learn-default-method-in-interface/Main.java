
interface BankAccount {
	default void defaultBehavior() {
		System.out.println("This is the default behavior");
	}

	public static void transfer() {
		System.out.println("Bat dau chuyen tuyen");
	}
}

interface BankAccountLogging {
	default void defaultBehavior() {
		System.out.println("This is the default behavior");
	}
}


public class Main implements BankAccount, BankAccountLogging {

	public void defaultBehavior() {
		System.out.println("This is the common default behavior");
		BankAccount.super.defaultBehavior();
		BankAccountLogging.super.defaultBehavior();
	}

	public static void main(String[] args) {
		BankAccount.transfer();
	}

}
