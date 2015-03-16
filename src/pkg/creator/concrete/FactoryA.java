package pkg.creator.concrete;

import pkg.creator.Creator;
import pkg.product.Product;
import pkg.product.concrete.*;

public class FactoryA extends Creator {

	@Override
    protected Product factoryMethod(String pProductName) { 
		
		Product product = null;
		
		if (pProductName.equals("ProductA")) {
			product = new ProductA();
		}
		else if (pProductName.equals("ProductAA")) {
			product = new ProductAA();
		}
		
		return product;

    }

}
