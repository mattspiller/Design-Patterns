// Written by Matt Spiller

package builderdesignpackage;

public class SamsungGalaxyS10 extends Phone
{
	@Override
	public float price()
	{
		return 1099.99f;
	}
	
	@Override 
	public String make()
	{
		return "Samsung";
	}
	
	@Override
	public String model()
	{
		return "Galaxy S10";
	}
}
