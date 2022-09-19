package sept16;

/* Iterate for loop form 50 to 100, and using break statement print only even numbers til 75. */
public class Exercise11 {
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			if (i % 2 ==0) {
				System.out.println(i);
			} if (i >= 75) {
				break;
			}
		}
	}
}
