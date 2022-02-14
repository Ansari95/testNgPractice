package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class ExceptionHandlingExample {

	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void exceptionHandlingExaple() {
		
		int i = 10/0;
		System.out.println(i);
		
		
	}
	
}
