import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	String name;
	double balance, current, savings;

	/**
	 * parameterized constructor which accepts password and open account according
	 * to the password.
	 * 
	 * @param pass Password of user
	 */
	Account(int pass) {
		switch (pass) {
		case 12345:
			name = "Swapnil";
			current = 10000.00;
			savings = 20000.00;
			break;
		case 69696:
			name = "jay";
			current = 10000.00;
			savings = 20000.00;
			break;
		case 42020:
			name = "Sameer";
			current = 10000.00;
			savings = 20000.00;
			break;
		default:
			System.out.println("Wrong password");
			System.exit(0);
			break;
		}
	}

	/**
	 * choose current account/saving account according to user's choice.
	 * 
	 * @param choice Used to identify type of account.
	 */
	void initialize(int choice) {
		if (choice == 1) {
			balance = current;
			System.out.println("You Selected Current Account");
		} else if (choice == 2) {
			balance = savings;
			System.out.println("You Selected Saving Account");
		} else {
			System.out.println("Wrong Input");
			System.exit(0);
		}
	}

	/**
	 * Fast cash options.
	 */

	void fastcash() {

		System.out.println("\nSelect Fastcash ammount:");
		System.out.println("1.50\n2.100\n3.150\n4.200");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("You withdrawn Rs.50");
			balance = balance - 50;
			break;
		case 2:
			System.out.println("You withdrawn Rs.100");
			balance = balance - 100;
			break;
		case 3:
			System.out.println("You withdrawn Rs.150");
			balance = balance - 150;
			break;
		case 4:
			System.out.println("You withdrawn Rs.200");
			balance = balance - 200;
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
	}

	/**
	 * To print receipt.
	 */
	void printreceipt() {
		System.out.println("Account Name: " + name);
		System.out.println("Balance is: Rs." + balance);
	}

	/**
	 * To Withdraw amount.
	 */
	void withdrawal() {
		try {
			System.out.println("\nEnter cash ammount:");
			double ammount = sc.nextInt();
			if (ammount < 0) {
				System.out.println("Error:Negative Cash Ammount");
			} else if (ammount > balance) {
				System.out.println("Not enough balance :(");
			} else {
				balance = balance - ammount;
			}
		} catch (InputMismatchException e) {
			System.out.println("Error:Invalid Input");
		}
	}

	/**
	 * To deposit amount.
	 */
	void deposit() {
		try {
			System.out.println("Enter the amount to deposit:");
			double depo = sc.nextInt();
			if (depo < 0) {
				System.out.println("Error:Negative Cash Amount");
			} else
				balance = depo + balance;
		} catch (InputMismatchException e) {
			System.out.println("Error:Invalid Input");
		}
	}
}
