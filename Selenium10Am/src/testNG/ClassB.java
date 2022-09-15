package testNG;

import org.testng.annotations.Test;

public class ClassB {

	@Test(priority = -4)
	public void login() {
		System.out.println("Logged into the app");
	}
	
	@Test(priority = 0)
	public void selectPropduct() {
		System.out.println("product selected");
	}
	
	@Test(priority = -2)
	public void addProductToCart() {
		System.out.println("product added to cart");
	}
	
	@Test(priority = 5)
	public void payment() {
		System.out.println("payment complete");
	}
}
