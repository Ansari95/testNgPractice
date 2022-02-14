package org.DataproviderWithOtherClass;


import org.testng.annotations.Test;

public class DataProviderexample {
	
	
	
	
	@Test(dataProvider = "credentials", dataProviderClass = DataproviderwithOtherClass.class)
	public void test(String username , String password) {
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
}
