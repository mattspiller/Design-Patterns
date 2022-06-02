// Written by Matt Spiller

package prototypedesignpackage;

public class PrototypePatternDemo {
	
	public static void main(String[] args)
	{
		AutomobileCache.loadCache();
		
		// Create a clone of the Sedan object held in the AutomobileCache Hashtable automobileMap with id=1, then print it's specifications (using it's getters).
		Automobile cloneSedan = (Automobile) AutomobileCache.getAutomobile(1);
		System.out.println("Type: " + cloneSedan.getType());
		System.out.println("Number of doors: " + cloneSedan.getNumberOfDoors());
		System.out.println("Number of seats: " + cloneSedan.getNumberOfSeats());
		System.out.println("Trunk space: " + cloneSedan.getTrunkSpace() + " cubic feet\n");
		
		// Create a clone of the Minivan object held in the AutomobileCache Hashtable automobileMap with id=2, then print it's specifications (using it's getters).
		Automobile cloneMinivan = (Automobile) AutomobileCache.getAutomobile(2);
		System.out.println("Type: " + cloneMinivan.getType());
		System.out.println("Number of doors: " + cloneMinivan.getNumberOfDoors());
		System.out.println("Number of seats: " + cloneMinivan.getNumberOfSeats());
		System.out.println("Trunk space: " + cloneMinivan.getTrunkSpace() + " cubic feet\n");
		
		// Create a clone of the Truck object held in the AutomobileCache Hashtable automobileMap with id=3, then print it's specifications (using it's getters).
		Automobile cloneTruck = (Automobile) AutomobileCache.getAutomobile(3);
		System.out.println("Type: " + cloneTruck.getType());
		System.out.println("Number of doors: " + cloneTruck.getNumberOfDoors());
		System.out.println("Number of seats: " + cloneTruck.getNumberOfSeats());
		System.out.println("Trunk space: " + cloneTruck.getTrunkSpace() + " cubic feet\n");
		
		// Create a clone of the SportsCar object held in the AutomobileCache Hashtable automobileMap with id=4, then print it's specifications (using it's getters).
		Automobile cloneSportsCar = (Automobile) AutomobileCache.getAutomobile(4);
		System.out.println("Type: " + cloneSportsCar.getType());
		System.out.println("Number of doors: " + cloneSportsCar.getNumberOfDoors());
		System.out.println("Number of seats: " + cloneSportsCar.getNumberOfSeats());
		System.out.println("Trunk space: " + cloneTruck.getTrunkSpace() + " cubic feet\n");
		
		// Prove that objects from AutomobileCache Hashtable automobileMap are indeed clones, and are not pointers to the same object
		Automobile cloneSedan2 = (Automobile) AutomobileCache.getAutomobile(1);
		System.out.println("Are cloneSedan and cloneSedan2 the same object?");
		if (cloneSedan.equals(cloneSedan2))
			System.out.println("Yes, they are the same object with the same memory address.");
		else
			System.out.println("No, these objects have identical characteristics with the exception of having different memory addresses, therefore, they are two seperate objects.");

	}
}
