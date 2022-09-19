package sept16;

/*  Write a program by using super keyword for variable, constructer. */

public class Exercise16 {
	public static void main(String[] args) {
		Frog f1 = new Frog();
		f1.makesNoise();
	}
}

	class Frog extends Animal {
		void makesNoise() {
			super.makesNoise();
			System.out.println("Ribbit");
		}

}
