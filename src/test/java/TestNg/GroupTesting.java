package TestNg;

import org.testng.annotations.Test;

public class GroupTesting {
	
	@Test(groups = "samsung")
	void samsungm30() {
		
		System.out.println("samsumg m30");
	}
	
	@Test(groups = "samsung")
	void samsungm51() {
		
		System.out.println("samsung m51");
	}

	
	@Test(groups = "oppo")
	void oppof17() {
		
		System.out.println("oppo f17");
		
	}
	@Test(groups = "oppo")
	void oppof17pro() {
		
		System.out.println("oppo f17pro");
	}
}
