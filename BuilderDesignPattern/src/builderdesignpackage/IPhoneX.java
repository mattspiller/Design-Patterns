// Written by Matt Spiller

package builderdesignpackage;

public class IPhoneX extends Phone
{
	@Override
	public float price()
	{
		return 1299.99f;
	}
	
	@Override
	public String make()
	{
		return "Apple";
	}
	
	@Override
	public String model()
	{
		return "iPhone X";
	}
}
