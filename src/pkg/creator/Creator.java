package pkg.creator;

import pkg.product.Product;

public abstract class Creator {

	public Product createProduct(String pProductName) {

		//Delegation der Objekterstellung an Subklasse 
		Product product = factoryMethod(pProductName);

		//weitere Verarbeitung 
		product.setState(23);
		product.prepare();

		return product;

	}

	//Definition der Factory Method 
	protected abstract Product factoryMethod(String pProductName);

}