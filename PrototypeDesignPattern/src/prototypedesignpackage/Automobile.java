// Written by Matt Spiller

package prototypedesignpackage;

public abstract class Automobile implements Cloneable {
	
	private int id;
	protected String type;
	protected int numberOfDoors;
	protected int numberOfSeats;
	protected double trunkSpace;
	
	public void printSpecifications()
	{
		System.out.println("Type: " + type);
		System.out.println("Number of doors: " + numberOfDoors);
		System.out.println("Number of seats: " + numberOfSeats);
		System.out.println("Trunk space: " + trunkSpace + " cubic feet\n");
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}
	
	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}
	
	public double getTrunkSpace()
	{
		return trunkSpace;
	}
	
	public Object clone()
	{
		Object clone = null;
		
		try 
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return clone;
	}
}
