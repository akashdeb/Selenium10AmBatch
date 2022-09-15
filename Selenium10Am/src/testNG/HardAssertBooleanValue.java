package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssertBooleanValue {

	@Test
	public void demo() {
		
		boolean expectedResult = true;
		boolean actualResult = false;
		Assert.assertEquals(actualResult, expectedResult);\
}
}