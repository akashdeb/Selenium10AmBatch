package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassE {

	@Test
	public void login() {
		System.out.println("Logged into the app");
	}
	
	@Test
	public void selectPropduct() {
		Assert.fail();
		System.out.println("product selected");
	}
	
	@Test(dependsOnMethods = "selectPropduct")
	public void addProductToCart() {
		System.out.println("product added to cart");
	}
	
	@Test(dependsOnMethods = "addProductToCart")
	public void payment() {
		System.out.println("payment complete");
	}

}
