// Written by Matt Spiller

package prototypedesignpackage;

public class Truck extends Automobile {
	
	public Truck()
	{
		type = "Truck";
		numberOfDoors = 4;
		numberOfSeats = 5;
		trunkSpace = 80.0;
	}
	
	/*
	@Override
	public void printSpecifications()
	{
		System.out.println("Type: Truck");
		System.out.println("Number of doors: 4");
		System.out.println("Number of seats: 5");
		System.out.println("Trunk space: 80 cubic feet\n");
	} */
}
