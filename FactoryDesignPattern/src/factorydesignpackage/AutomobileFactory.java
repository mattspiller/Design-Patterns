// Written by Matt Spiller

package factorydesignpackage;

public class AutomobileFactory {
	
	public Automobile createAutomobile (String vehicleType)
	{
		if (vehicleType.equalsIgnoreCase("Sedan"))
			return new Sedan();
		else if (vehicleType.equalsIgnoreCase("Minivan"))
			return new Minivan();
		else if (vehicleType.equalsIgnoreCase("Truck"))
			return new Truck();
		else if (vehicleType.equalsIgnoreCase("Sports Car"))
			return new SportsCar();
		else
			return null;
	}
}
