package sept16;

import java.util.Scanner;
/* Take command like argument and check it is odd or even number
by using if statement 
Print the given number(command line argument) is even or odd. */

public class Exercise2and3 {	
	public static void main(String[] args) {
		System.out.println("Is your number even or odd?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		evenOrOdd(x);
	}
	
	
	public static void evenOrOdd(int x) {
		if (x %2 == 0 ) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}