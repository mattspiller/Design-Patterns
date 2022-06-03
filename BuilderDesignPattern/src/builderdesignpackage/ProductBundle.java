// Written by Matt Spiller

package builderdesignpackage;

import java.util.ArrayList;

public class ProductBundle 
{
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product)
	{
		products.add(product);
	}
	
	public float getCost()
	{
		float price = 0.0f;
		float discount = 0.0f;
		int samsungProducts = 0, appleProducts = 0;
		
		for(Product product : products)
		{
			if(product.make().equals("Samsung"))
				samsungProducts++;
			else if(product.make().equals("Apple"))
				appleProducts++;
			
			price += product.price();
		}
		
		if(samsungProducts >= 2)
		{
			// The discount is a function of the number of Samsung products included in the bundle, growing at a logarithmic rate as as samsungProducts rises
			discount += 50.0 * (samsungProducts / (1 + Math.log(samsungProducts)));
		}
		if (appleProducts >= 2)
		{
			// The discount is a function of the number of Apple products included in the bundle, growing at a logarithmic rate as as appleProducts rises
			discount += 60.0 * (appleProducts / (1 + Math.log(appleProducts)));
		}
		
		return price - discount;
	}
	
	public void showProducts()
	{
		for(Product product : products)
		{
			System.out.println("Make: " + product.make() + "\nModel: " + product.model() + "\nPrice: $" + product.price() + "\nWarranty: " + product.warranty().type() + "\n"); 
		}
	}
}
