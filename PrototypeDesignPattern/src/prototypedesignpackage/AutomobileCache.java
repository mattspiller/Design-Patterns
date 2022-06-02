// Written by Matt Spiller

package prototypedesignpackage;

import java.util.Hashtable;

public class AutomobileCache {

	private static Hashtable<Integer, Automobile> automobileMap = new Hashtable<Integer, Automobile>();
	
	public static Automobile getAutomobile(int id)
	{
		return (Automobile) automobileMap.get(id).clone();
	}
	
	public static void loadCache()
	{
		Sedan sedan = new Sedan();
		sedan.setId(1);
		automobileMap.put(sedan.getId(), sedan);
		
		Minivan minivan = new Minivan();
		minivan.setId(2);
		automobileMap.put(minivan.getId(), minivan);
		
		Truck truck = new Truck();
		truck.setId(3);
		automobileMap.put(truck.getId(), truck);
		
		SportsCar sportsCar = new SportsCar();
		sportsCar.setId(4);
		automobileMap.put(sportsCar.getId(), sportsCar);
	}
}
