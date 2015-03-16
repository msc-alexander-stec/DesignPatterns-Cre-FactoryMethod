package pkg.creator.concrete;

import pkg.creator.Creator;
import pkg.product.Product;
import pkg.product.concrete.*;

public class FactoryB extends Creator {

	@Override
    protected Product factoryMethod(String pProductName) { 
		
		Product product = null;
		
		if (pProductName.equals("ProductB")) {
			product = new ProductB();
		}
		
		return product;
		
    }

}