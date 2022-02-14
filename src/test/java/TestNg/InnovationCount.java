package TestNg;

import org.testng.annotations.Test;

public class InnovationCount {
	
	@Test(invocationCount = 3)
	void innovationCountExample() {
		
		System.out.println("invocationCount");
	}

}
