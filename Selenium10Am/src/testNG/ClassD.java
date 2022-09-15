package testNG;

import org.testng.annotations.Test;

public class ClassD {
	@Test(enabled = false)
	public void d() {
		System.out.println("From D");
	}
	
	@Test
	public void a() {
		System.out.println("From A");
	}
	
	@Test
	public void c() {
		System.out.println("From C");
	}
	
	@Test (invocationCount = 0)
	public void b() {
		System.out.println("From B");
	}
}
