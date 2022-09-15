package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssert {
	
	@Test
	public void demo() {
		
		String expectedResult = "Qspiders";
		String actualResult = "Jspiders";
		Assert.assertEquals(actualResult, expectedResult);
	}

}
