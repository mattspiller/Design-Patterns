// Written by Matt Spiller

package builderdesignpackage;

public abstract class SmartWatch implements Product
{
	@Override
	public Warranty warranty()
	{
		return new SmartWatchWarranty();
	}
	
	@Override
	public abstract float price();
}
