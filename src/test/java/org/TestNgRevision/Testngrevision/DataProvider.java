package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Test;

public class DataProvider {

/*	Object [][] data = {
			
			{"admin","admin1"},
			{"admin1","admi2"}
			
			
	}; */
	
	@org.testng.annotations.DataProvider
	public Object[][] testdata() {
		
		return new Object[] [] {
			{"hello","hai"},
			{"admin1","admin2"},
	     	{"admin2","admin2"}
			
			
		};
		
	}
	
	
	@Test(dataProvider ="testdata")
	public void loginFunctionality(String username, String password) {
		
		System.out.println("username is " + username);
		System.out.println("password is "+ password);
		
	}
	
	
}
