package sept16;
/*  Write a program for constructer overloading example. */

public class Excerise14 {
	public static void main(String[] args) {
		phone p1 = new phone("Apple", "iPhone", "Verizon", 256);
	}
}

class phone {
	//instance variables
	String brand;
	String phoneName;
	String carrier;
	int memorySize;
	
	//Methods
	void receiveCall() {
		System.out.println("Ringtone");
	}
	void makeCall() {
		System.out.println("Ring ring");
	}
	void receiveText() {
		System.out.println("Ping");
	}
	
	//Constructor
	public phone(String brand, String phoneName, String carrier, int memorySize) {
		this.brand = brand;
		this.phoneName = phoneName;
		this.carrier = carrier;
		this.memorySize = memorySize;
	}
}
	
	
