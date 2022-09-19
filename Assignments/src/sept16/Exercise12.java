package sept16;

/* Write a program for Inheritance example */

public class Exercise12 {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.name = "Tony the Tiger";
		System.out.println(t1.name);
	}
}

	class Animal {
		String name;
		int lifespan;
		
		void makesNoise() {
			System.out.println("This animal makes a noise.");
		}
	}
	
	class Tiger extends Animal {
		
	}

