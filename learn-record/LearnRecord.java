import java.util.Scanner;

public class LearnRecord {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap id:");
		String id = scanner.nextLine();

		System.out.println("Nhap so tai khoar:");
		String accountNumber = scanner.nextLine();

		System.out.println("Nhap so cvv:");
		int cvv = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Nhap ten tai khoan:");
		String accountName = scanner.nextLine();

		System.out.println(new BankAccountDTO(id, accountNumber, cvv, accountName));
	}
}



