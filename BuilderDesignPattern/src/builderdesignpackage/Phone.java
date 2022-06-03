// Written by Matt Spiller

package builderdesignpackage;

public abstract class Phone implements Product 
{
	@Override
	public Warranty warranty()
	{
		return new PhoneWarranty();
	}
	
	@Override
	public abstract float price();
}
