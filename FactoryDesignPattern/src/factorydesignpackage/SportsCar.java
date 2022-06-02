// Written by Matt Spiller

package factorydesignpackage;

public class SportsCar implements Automobile {
	
	@Override
	public void printSpecifications()
	{
		System.out.println("Type: Sports Car");
		System.out.println("Number of doors: 2");
		System.out.println("Number of seats: 2");
		System.out.println("Trunk space: 10 cubic feet\n");
	}
}
