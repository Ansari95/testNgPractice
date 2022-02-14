package TestNg;

import org.testng.annotations.Test;

public class EnabledKeyWord {
	
	
	

	@Test(enabled = true)
	void skiptest() {
		
		System.out.println("skip test cases");
	}
	
	
}
