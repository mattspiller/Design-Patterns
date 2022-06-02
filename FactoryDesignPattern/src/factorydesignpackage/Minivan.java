// Written by Matt Spiller

package factorydesignpackage;

public class Minivan implements Automobile {
	
	@Override
	public void printSpecifications()
	{
		System.out.println("Type: Minivan");
		System.out.println("Number of doors: 4");
		System.out.println("Number of seats: 7");
		System.out.println("Trunk space: 40 cubic feet\n");
	}
}
