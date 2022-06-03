// Written by Matt Spiller

package builderdesignpackage;

public class BuilderPatternDemo 
{
	public static void main(String[] args) 
	{
		ProductBundleBuilder builder = new ProductBundleBuilder();
		
		// Create a basic samsung bundle
		System.out.println("--------------");
		System.out.println("Samsung Bundle\n");
		ProductBundle samsungBundle = builder.buildBundle(1, 0, 1, 0);
		samsungBundle.showProducts();
		System.out.println("Total Cost: $" + String.format("%.2f", samsungBundle.getCost()) + "\n");
		
		// Create a basic apple bundle
		System.out.println("--------------");
		System.out.println("Apple Bundle\n");
		ProductBundle appleBundle = builder.buildBundle(0, 1, 0, 1);
		appleBundle.showProducts();
		System.out.println("Total Cost: $" + String.format("%.2f", appleBundle.getCost()) + "\n");
		
		// Create a random bundle
		// Create random inputs between 0 and 5
		System.out.println("--------------");
		int numberOfSamsungPhones = (int) Math.floor(Math.random() * (5 + 1));
		int numberOfApplePhones = (int) Math.floor(Math.random() * (5 + 1));
		int numberOfSamsungWatches = (int) Math.floor(Math.random() * (5 + 1));
		int numberOfAppleWatches = (int) Math.floor(Math.random() * (5 + 1));
		System.out.println("Random Bundle\n");
		ProductBundle randomBundle = builder.buildBundle(numberOfSamsungPhones, numberOfApplePhones, numberOfSamsungWatches, numberOfAppleWatches);
		randomBundle.showProducts();
		System.out.println("Total Cost: $" + String.format("%.2f", randomBundle.getCost()) + "\n");
	}
}
