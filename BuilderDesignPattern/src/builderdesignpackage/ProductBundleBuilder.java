// Written by Matt Spiller

package builderdesignpackage;

public class ProductBundleBuilder 
{
	public ProductBundle buildBundle(int numberOfSamsungPhones, int numberOfApplePhones, int numberOfSamsungWatches, int numberOfAppleWatches)
	{
		ProductBundle bundle = new ProductBundle();
		for(int i = 0; i < numberOfSamsungPhones; i++)
			bundle.addProduct(new SamsungGalaxyS10());
		for(int i = 0; i < numberOfApplePhones; i++)
			bundle.addProduct(new IPhoneX());
		for(int i = 0; i < numberOfSamsungWatches; i++)
			bundle.addProduct(new GalaxyWatch4());
		for(int i = 0; i < numberOfAppleWatches; i++)
			bundle.addProduct(new AppleWatchSeries7());
		
		return bundle;
	}
}
