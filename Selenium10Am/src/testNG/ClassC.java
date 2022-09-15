package testNG;

import org.testng.annotations.Test;

public class ClassC {

	@Test
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
	
	@Test
	public void b() {
		System.out.println("From B");
	}

}
