// Author: Matt Spiller

package factorydesignpackage;

public class FactoryPatternDemo {
	
	public static void main(String[] args)
	{
		AutomobileFactory automobileFactory = new AutomobileFactory();
		
		// Create Sedan and print specifications
		Automobile sedan = automobileFactory.createAutomobile("Sedan");
		sedan.printSpecifications();
		
		// Create Minivan and print specifications
		Automobile minivan = automobileFactory.createAutomobile("Minivan");
		minivan.printSpecifications();
		
		// Create Truck and print specifications
		Automobile truck = automobileFactory.createAutomobile("Truck");
		truck.printSpecifications();
		
		// Create Sports Car and print specifications
		Automobile sportsCar = automobileFactory.createAutomobile("Sports Car");
		sportsCar.printSpecifications();
	}
}
