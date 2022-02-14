package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class AlwaysRun_concept {

	
	@Test(description = "hello")
	public void method1() {
		
		System.out.println("method1");
		
		
		
	}
	
	@Test(dependsOnGroups = "method1", alwaysRun = true)
	public void method2() {
		
		System.out.println("method2");
		
	}
	
}
