// Written by Matt Spiller

package singletondesignpackage;

public class Earth {

	private static Earth theOneAndOnlyPlanetEarth = new Earth();
	
	// By making the default constructor private, only this class can create an Earth object
	private Earth() {}
	
	public static Earth getTheEarth()
	{
		return theOneAndOnlyPlanetEarth;
	}
	
	public void sayHello()
	{
		System.out.println("Hello, I'm the world.");
	}
}
