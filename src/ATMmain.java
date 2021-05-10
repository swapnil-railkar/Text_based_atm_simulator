import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMmain {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password:");
		int password = sc.nextInt();

		Account account = new Account(password);

		printSeparator();
		System.out.println("Select Account:");
		try {
			System.out.println("1.Current Account\n2.Savings Account");
			int choice = sc.nextInt();
			account.initialize(choice);
		} catch (InputMismatchException e) {
			System.out.println("Error:Invalid Input");
			System.exit(0);
		}

		int ch = 1;
		while (ch == 1) {
			try {
			printSeparator();
			System.out.println("\t\tPlease select type of transactions ");
			System.out.println("1.Fast Cash\n2.Withdrawal");
			System.out.println("3.Balance Inquiry\n4.Deposit");
			int type = sc.nextInt();
			switch (type) {
			case 1:
				System.out.println("You selected : Fast Cash");
				printSeparator();
				account.fastcash();
				account.printreceipt();
				break;
			case 2:
				System.out.println("You selected : Withdrawal");
				printSeparator();
				account.withdrawal();
				account.printreceipt();
				break;
			case 3:
				System.out.println("You selected : Balance Inquiry");
				printSeparator();
				account.printreceipt();
				break;
			case 4:
				System.out.println("You selected : Deposit");
				printSeparator();
				account.deposit();
				account.printreceipt();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			}catch(InputMismatchException e)
			{
				System.out.println("Error:Invalid Input");
				System.exit(0);
			}
			printSeparator();
			System.out.println("Do you want to continue:\n1-Continue\n2-Stop");
			ch = sc.nextInt();

		}
		sc.close();
	}

	/**
	 * Print separator.
	 */
	private static void printSeparator() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
	}

}