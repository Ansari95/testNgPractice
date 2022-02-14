package TestNg;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {

	

	
	
	@Test
	void softAssert() {
		
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(false, true);
		sf.assertAll();
	}
	
	@Test
	void hardAssert() {
		
		Assert.assertEquals(true, true);
		System.out.println("This is assert example");
	}
	
}
