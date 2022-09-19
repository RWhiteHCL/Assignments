package sept16;

/*   Print even number between 1 to 100 using for loop. */
public class Exercise5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
