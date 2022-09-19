package sept16;
/*  Iterate for loop form 1 to 100, and using continue statement print only add numbers. */ 
public class Exercise10 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
