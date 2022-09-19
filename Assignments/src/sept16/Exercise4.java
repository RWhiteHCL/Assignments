package sept16;

import java.util.Scanner;

/*For a given number integer, print in the words using switch statement 1 to 10.
    Ex : if input is 5, then it should print "Five" */

public class Exercise4 {	
	public static void main(String[] args) {
		System.out.println("Please give a number 1-10."); 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		printNumber(x);
	}
	public static void printNumber(int x) {
		switch(x) {
		case 1 :
			System.out.println("One");
			break;
		case 2 :
			System.out.println("Two");
			break;
		case 3 :
			System.out.println("Three");
			break;
		case 4 :
			System.out.println("Four");
			break;
		case 5 :
			System.out.println("Five");
			break;
		case 6 :
			System.out.println("Six");
			break;
		case 7 :
			System.out.println("Seven");
			break;
		case 8 :
			System.out.println("Eight");
			break;
		case 9 :
			System.out.println("Nine");
			break;
		case 10 :
			System.out.println("Ten");
			break;
		default:
			System.out.println("Please enter a valid number 1-10.");
		}
	}
}