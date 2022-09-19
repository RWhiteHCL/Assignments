package sept16;

import java.util.Scanner;

//Take couple of variables (like int=1, j=5) and do arithmetic, Unary Relational and  Logical Operation
public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		int x = sc.nextInt();
		System.out.println("Give me another number");
		int y = sc.nextInt();
		
		System.out.println("x + y = " + (x + y));
		
	
		System.out.println("Is your first number bigger than your second number?");
		if(x > y) {
			System.out.println("Yes, your first number is larger than your second.");
		}
			else {
				System.out.println("No, your second number is larger than your first.");
			}
		}
		
	}
