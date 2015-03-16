package pkg.product;

public abstract class Product {

	private int basisState;

	public void prepare() {
		System.out.println("Preparing product");
	}

	public void setState(int pState) {
		basisState = pState;
	}

	public abstract int getPrice();

}
