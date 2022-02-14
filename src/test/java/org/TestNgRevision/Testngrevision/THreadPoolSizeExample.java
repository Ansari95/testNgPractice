package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class THreadPoolSizeExample {

	
	
	@Test(invocationCount = 3 , threadPoolSize = 2)
	public void browserLanch() {
		
		
		System.out.println("browserLanch");
	}
	
	
}
