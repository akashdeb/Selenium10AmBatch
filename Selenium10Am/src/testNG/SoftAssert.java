package testNG;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo() {
		String expectedResult = "Qspiders";
		String actualResult = "Jspiders";
		org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("Demo1");
		softAssert.assertAll();
		System.out.println("Demo2");
	}

}
