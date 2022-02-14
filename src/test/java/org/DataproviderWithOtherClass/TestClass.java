package org.DataproviderWithOtherClass;

import org.testng.annotations.Test;

public class TestClass {
	
	
	@Test(dataProvider = "testData" , dataProviderClass = DataproviderClass.class)
	
	public void test(String username, String passsword) {
		
		
		System.out.println(username + passsword);
		
	}
	
	
	@Test(dataProvider = "testData" ,dataProviderClass = DataproviderClass.class)
	public void test1(String usernam , String password , String testdata) {
		
		
		System.out.println(usernam + password + testdata);
		
		
	}

}
