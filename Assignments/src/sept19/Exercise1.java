package sept19;
/*Create a washing machine class with methods as swtichON, acceptClothes, acceptDetergent, switchOFF. 
    acceptClothes accepts the noofClothes as argument & returns the no of Clothes. */

public class Exercise1 {
	public static void main(String[] args) {
		WashingMachine wm1 = new WashingMachine();
		wm1.acceptClothes(5);
	}
}

class WashingMachine {
	
	//methods
	public void switchON() {
		System.out.println("The machine is on.");
	}
	
	public void acceptClothes(int noofClothes) {
		System.out.println("Please add your " + noofClothes + " clothes.");
	}
	
	public void acceptDetergent() {
		System.out.println("Please add your detergent.");
	}
	public void switchOFF() {
		System.out.println("Your clothes are finished.");
	}
}
