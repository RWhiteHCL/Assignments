package sept19;

import java.util.Scanner;

/* Create a Vehicle having following attributes. vehicle no, Model  manufacturer and color. 
 * Create truck which has following additional attributes: loadingcapacity(100 tons). 
 * Add a behavior tochange the color and loading capacity. Display the updated truck details. */
public class Exercise4 {
	public static void main(String[] args) {
		//Create a truck
		Vehicle v1 = new Vehicle(16132, "Ford", "red", 100);
		
		//Change the color and loading capacity
		System.out.println("The current color is: " + v1.getColor());
		System.out.println("The current loading capacity is: " + v1.getLoadingCapacity());
		Scanner sc = new Scanner(System.in);
		System.out.println("What color do you want your truck to be?");
		String newColor = sc.nextLine();
		System.out.println("What do you want to be the new loading capacity?");
		int newLC = sc.nextInt();
		
		v1.toChange(newColor, newLC);
	}
	
}

class Vehicle {
	private int vehicleNo;
	private String manufacturer;
	private String color;
	private int loadingCapacity;
	
	// Methods
	public void toChange(String newColor, int newLC) {
		setColor(newColor);
		setLoadingCapacity(newLC);
		System.out.println("The new color is "+ getColor() + " and the new loading capacity is " + getLoadingCapacity() +".");
	}
	// Constructor
	public Vehicle(int vehicleNo, String manufacturer, String color, int loadingCapacity) {
		this.vehicleNo = vehicleNo;
		this.manufacturer = manufacturer;
		this.color = color;
		this.loadingCapacity = loadingCapacity;
	}

	// Getters and Setters
	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(int loadingCapacity) {
		this.loadingCapacity = loadingCapacity;
	}

}