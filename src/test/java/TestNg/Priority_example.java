package TestNg;

import org.testng.annotations.Test;

public class Priority_example {

	@Test
	void method1() {
		
		System.out.println("method1");
	}
	
	@Test
	void method2() {
		
		System.out.println("method2");
	}
	
	@Test(priority = -1)
	void browserLanch() {
		
		System.out.println("browserLanch");
	}
	
	@Test(priority = 0)
	void Amehtod() {
		
		System.out.println("amerhod");
	}
}
