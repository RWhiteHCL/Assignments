package sept19;

import java.util.HashMap;
import java.util.Scanner;

/*The bookstore sells books, music CD's, and software's. 
 * Typically a customer first logs on to the system , entering a customer id and password. 
 * The customer can then browse for titles or search by keyword. 
 * The customer puts some of the titles into a shopping cart which keeps track of the desired titles. 
 * When the customer is done shopping, he/she confirms the order, shipping and billing address. 
 * The bookstore system then issues a shipping order, bills the customer and issues an electronic receipt.
At the end of transaction the customer logs off.   */

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Welcome to the Bookstore! Do you have an account? Y/N.");
		String acct = sc2.nextLine().toLowerCase();
		if (acct.equals("n")) {
			System.out.println("Please create an account");
			Bookstore u1 = new Bookstore();
			u1.createNewUser();
		} 
		
		
		System.out.println("Please login now");
		System.out.println("Customer ID");
		int ID = sc2.nextInt();

		if (Bookstore.passwordHM.containsKey(ID)) {
			//If the ID is in the HM, have the user enter a password
			System.out.println("Password: ");
			//User enter password
			String password = sc2.nextLine(); 
			
			//Check if password matches the user ID
			boolean isAMatch = false;
			if (password.equals(Bookstore.passwordHM.get(ID))) {
				isAMatch = true;
				System.out.println("Login Successful.");
			} else {
				System.out.println("Password incorrect. Please try again another time.");
			}

		} else {
			System.out.println("Not a valid Customer ID. Please try again later.");
		}
	}

}

class Bookstore {
	private int customerID;
	static int numOfCustomers = 001;
	private String password;
	static HashMap<Integer, String> passwordHM = new HashMap<>();

	public void createNewUser() {
		customerID = numOfCustomers++;
		System.out.println("Your new customer ID is " + customerID);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose a new password.");
		password = sc.nextLine();
		passwordHM.put(customerID, password);

	}

}
