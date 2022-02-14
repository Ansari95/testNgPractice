package org.DataproviderWithOtherClass;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataproviderwithOtherClass {
	
	Object [][] data = null;
	
	@DataProvider(name ="credentials")
	public Object[][] tesData(Method m) {
		
		if(m.getName().equals("test")) {
		
		data = new Object[][] {
			
			{"usernmae", "password"},
			{"username1","password1"},
			{"username2","password2"}
			
		};
		
		}
		
		if(m.getName().equals("test1")) {
			
			
			data = new Object[][] {
				{"user","pas","cap"},
				{"user1","pass1","cap1"}
			};
			
		}
		
		return data;
	
	}
	

}
