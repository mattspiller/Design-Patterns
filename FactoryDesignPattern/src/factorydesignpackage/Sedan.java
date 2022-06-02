// Written by Matt Spiller

package factorydesignpackage;

public class Sedan implements Automobile {
	
	@Override
	public void printSpecifications()
	{
		System.out.println("Type: Sedan");
		System.out.println("Number of doors: 4");
		System.out.println("Number of seats: 5");
		System.out.println("Trunk space: 16 cubic feet\n");
	}
}
