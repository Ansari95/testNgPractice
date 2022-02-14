package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class GroupTesting {

	
	
	
	@Test(groups="regression test")
	public void method1() {
		
		System.out.println("method1 regreession");
		
	}
	
	
	@Test(groups="regression test")
	public void method2() {
		
		System.out.println("method2 regreesion");
		
	}
	
	
	@Test(groups ="smoke testing")
	public void method3() {
		
		
		System.out.println("method3 somke test");
		
	}
	
	@Test(groups ="smoke testing")
	public void method4() {
		
		
		System.out.println("method4 smoke test");
		
	}
	
}
	

