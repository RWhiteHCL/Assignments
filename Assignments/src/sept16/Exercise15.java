package sept16;
/* Write a program for Method overriding example. */ 

public class Exercise15 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makesNoise();
	}
}

class Dog extends Animal {
	@Override
	void makesNoise() {
	}
}

