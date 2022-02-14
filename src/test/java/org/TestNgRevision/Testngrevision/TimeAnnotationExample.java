package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class TimeAnnotationExample {
	
	
	@Test(timeOut = 3000)
	public void logIN() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("timeout ");
		
	}

}
