package sept19;

import java.util.Scanner;

/*Create a Bank class with methods deposit & withdraw. The deposit method would accept attributes amount & balance ( returns the new balance which
is the sum of amount & balance. Similarly the withdraw method would accept the attributes amount & balance & returns the new balance
if(balance >=amount or return 0 otherwise */

public class Exercise3 {
	public static void main(String[] args) {
		Bank b1 = new Bank();

		System.out.println("How much money do you have in your account?");
		Scanner sc = new Scanner(System.in);
		b1.setBalance(sc.nextDouble());

		System.out.println("Do you want to depost (d) or withdraw (w) money?");
		String choice = sc.next().toLowerCase();

		if (choice.equals("d")) {
			System.out.println("How much money did you want to deposit?");
			double amount = sc.nextDouble();
			b1.deposit(amount, b1.getBalance());
		} else if (choice.equals("w")) {
			System.out.println("How much money did you want to withdraw?");
			double amount = sc.nextDouble();
			b1.withdraw(amount, b1.getBalance());

		} else {
			System.out.println("Invalid Choice");
		}
	}

}

class Bank {
	private double balance;

	public void deposit(double amount, double balance) {
		balance = getBalance() + amount;
		System.out.println("You've deposited  $" + amount + ". Your new balance is $" + getBalance() + ".");
	}

	public void withdraw(double amount, double balance) {
		if (getBalance() - amount < 0) {
			System.out.println("You cannot withdraw money or you will overdraw your account. Your current balnce is $"
					+ getBalance());
		} else {
			balance = getBalance() - amount;
			System.out.println("You've removed $" + amount + ". Your new banlace is $" + balance + ".");
		}

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}