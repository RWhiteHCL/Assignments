package sept22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Database {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		// Create the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");

		// Create switch statement for insert update delete search
		System.out.println("Would you like to add, update, delete, or search within the Employee table? ");
		System.out.println("A, U, D, S");
		String choice = sc.next().toUpperCase();

		if (choice.equals("A")) {
			// Add to DB using user input
			System.out.println("Employee Number: ");
			int ieNum = sc.nextInt();
			System.out.println("Employee Name: ");
			String ieName = sc.next();
			System.out.println("Employee Salary: ");
			int ieSal = sc.nextInt();

			PreparedStatement psa = con.prepareStatement("insert into emp values(?,?,?)");
			psa.setInt(1, ieNum);
			psa.setString(2, ieName);
			psa.setInt(3, ieSal);

			psa.execute();
			System.out.println("You successfully added " + ieName + " to the employee database.");
		}

		// Update the existing records by empID

		else if (choice.equals("U")) {
			System.out.println("Please enter the employee ID for the employee you'd like you update: ");
			int ueNum = sc.nextInt();
			System.out.println("Employee Name: ");
			String ueName = sc.next();
			System.out.println("Salary: ");
			int ueSal = sc.nextInt();

			PreparedStatement psu = con.prepareStatement("update emp set ename = ?, esal = ? where eno = ?");

			psu.setString(1, ueName);
			psu.setInt(2, ueSal);
			psu.setInt(3, ueNum);

			psu.execute();
			System.out.println("You've successfully updated Employee ID " + ueNum + " in the employee database.");
		}

		// Delete the employee number you provided

		else if (choice.equals("D")) {

			System.out.println("Please enter the Employee ID for the employee you'd like to delete: ");
			int deNum = sc.nextInt();

			PreparedStatement psd = con.prepareStatement("delete from emp where eno = ?");

			psd.setInt(1, deNum);

			psd.execute();
			System.out.println("You've successfully deleted Employee ID " + deNum + " from the employee database.");
		}

		// Search by Emp Num
		else if (choice.equals("S")) {
			System.out.println("Please enter the Employee ID for the employee you'd like to search for: ");
			int seNum = sc.nextInt();

			PreparedStatement pss = con.prepareStatement("select * from emp where eno = ?");
			pss.setInt(1, seNum);

			ResultSet rs = pss.executeQuery();

			while (rs.next()) {
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				int esal = rs.getInt("esal");

				System.out.println("Employee Number: " + eno);
				System.out.println("Employee Name: " + ename);
				System.out.println("Employee Salary: " + esal);
			}
		}

		// Close connection
		con.close();

	}

}
