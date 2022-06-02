// Written by Matt Spiller

package factorydesignpackage;

public class Truck implements Automobile {
	
	@Override
	public void printSpecifications()
	{
		System.out.println("Type: Truck");
		System.out.println("Number of doors: 4");
		System.out.println("Number of seats: 5");
		System.out.println("Trunk space: 80 cubic feet\n");
	}
}
