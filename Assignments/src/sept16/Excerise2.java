package sept16;

import java.util.Scanner;

public class Excerise2 {	
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
