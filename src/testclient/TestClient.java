package testclient;

import pkg.creator.Creator;
import pkg.creator.concrete.FactoryA;
import pkg.creator.concrete.FactoryB;
import pkg.product.Product;

/*
 * See:
 * http://www.philipphauer.de/study/se/design-pattern/factory-method.php
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		// Create Factorys
		Creator creatorA = new FactoryA();
		Creator creatorB = new FactoryB();

		// Create ProductA
		Product productA = creatorA.createProduct("ProductA");
		System.out.println(productA.getPrice());

		// Create ProductAA
		Product productAA = creatorA.createProduct("ProductAA");
		System.out.println(productAA.getPrice());

		// Create ProductB
		Product productB = creatorB.createProduct("ProductB");
		System.out.println(productB.getPrice());

	}

}
