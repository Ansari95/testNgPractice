package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class PriorityTestingExample {

	
	@Test(priority = 0)
	public void method() {
		
		System.out.println("p 0");
		
	}
	
	
	@Test(priority = 1)
	public void method1() {
		
		System.out.println("p1");
		
	}
	
	@Test(priority = -1)
	public void method2() {
		
		
		System.out.println("p-1");
		
	}
	
}
