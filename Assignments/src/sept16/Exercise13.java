package sept16;
/* Write a program for Method overloading example.*/ 
public class Exercise13 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(1, 2, 3);
		System.out.println(c1.add(1,2));
		System.out.println(c1.add(1,2,3));		
	}
}

class Calculator {
	int x;
	int y;
	int z;
	
	//Methods
	public int add(int x, int y) {
		return  x+y;
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;
	}

	public Calculator(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	

}
