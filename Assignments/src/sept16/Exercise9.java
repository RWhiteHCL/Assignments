package sept16;

import java.util.ArrayList;
import java.util.List;

/* Print prime number from 1 to 100. */
public class Exercise9 {
	public static void main(String[] args) {
		List<Integer> primeNumbers = new ArrayList<>();

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumbers.add(i);
			}
		}
		
		for(Integer i: primeNumbers) {
			System.out.println(i);
		}
	}
	
}
