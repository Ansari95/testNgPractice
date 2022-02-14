package dataProvider;

import org.testng.annotations.Test;
import org.testng.internal.TestMethodWithDataProviderMethodWorker;

public class TestClass {
	
	
	@Test(dataProvider = "testData", dataProviderClass = TetsData.class)
	public void login(String username , String password) {
		
		System.out.println(username + password);
		
	}

	
	@Test(dataProvider = "te"
			+ "stData", dataProviderClass = TetsData.class)
	public void browser(String username , String password, String browsernamea) {
		
		System.out.println(username + password + browsernamea);
	}
}
