package sept16;

/*   Print number 1 to 5, 5 times using nested for loop */

public class Exercise6 {
	public static void main(String[] args) {
		for(int i= 1; i <= 5; i++) {
			System.out.println(i + ":");
			for(int j = 1; j <= 5; j++) {
				System.out.println(j);
			}
		}
	}
}
