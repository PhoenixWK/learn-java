import java.math.BigDecimal;

/**
 * Main
 */
/*public class Main {

	public static void main(String[] args) {
		Account a = new NormalBankAccount(AccountType.NORMAL, "123456", "NGUYEN VAN A", 100 , BigDecimal.valueOf(100000));
		Account b = new NormalBankAccount(AccountType.NORMAL, "123457", "NGUYEN VAN B", 101 , BigDecimal.valueOf(100000));

		System.out.println(a.transfer(b, BigDecimal.valueOf(50000)));
		System.out.println("New account balance: " + a.getBalance());

	}

}*/

abstract class MyAbstractClass {
	public MyAbstractClass() {
		System.out.println("Inside MyAbstractClass constructor");
	}
}

public class Main extends MyAbstractClass {
	public Main() {
		System.out.println("Inside Main constructor");
	}

	public static void main(String[] args) {
		Main a = new Main();
	}
}
