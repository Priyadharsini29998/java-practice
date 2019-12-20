import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		int opt, transactionAmount;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number ");
		String accountNumber = sc.nextLine();

		System.out.println("Enter the Account Balance ");
		int balance = Integer.parseInt(sc.nextLine());

		Account acctran = new Account(accountNumber, balance);

		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount ");
		opt = sc.nextInt();

		switch (opt) {

		case 1:
			if (opt == 1) {
				System.out.println("Enter the amount to deposit");
				transactionAmount = sc.nextInt();
				acctran.deposit(transactionAmount);
				break;
			}

		case 2:
			if (opt == 2) {
				System.out.println("Enter the amount to withdraw");
				transactionAmount = sc.nextInt();
				acctran.withdraw(transactionAmount);
				break;
			}
		default:
			System.out.println("Invalid");
			break;
		}
	}

}