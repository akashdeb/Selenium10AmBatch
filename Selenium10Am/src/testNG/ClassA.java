package testNG;

import org.testng.annotations.Test;

public class ClassA {

	@Test(invocationCount = 5)
	public void demo1() {
		System.out.println("The Demo Method");
	}
	
	

}
