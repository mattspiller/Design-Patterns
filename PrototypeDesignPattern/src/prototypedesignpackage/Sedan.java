// Written by Matt Spiller

package prototypedesignpackage;

public class Sedan extends Automobile {
	
	public Sedan()
	{
		type = "Sedan";
		numberOfDoors = 4;
		numberOfSeats = 5;
		trunkSpace = 16.0;
	}
	/*
	@Override
	public void printSpecifications()
	{
		System.out.println("Type: " + type);
		System.out.println("Number of doors: " + numberOfDoors);
		System.out.println("Number of seats: " + numberOfSeats);
		System.out.println("Trunk space: " + trunkSpace + " cubic feet\n");
	} */
}
