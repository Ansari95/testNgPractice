package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class DependicesinTestNg {
	
	@Test(enabled = true)
	public void method1() {
		
		System.out.println("This is method 1");
		
	}
	
	
	@Test(dependsOnMethods = "method1")
	public void method2() {
		
		
		System.out.println("This is method 2");
		
	}
	
	
	@Test(dependsOnMethods = "method2")
	public void method3() {
		
		System.out.println("this is method 3");
		
	}
	
	

}
