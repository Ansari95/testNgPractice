package org.DataproviderWithOtherClass;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	
	Object [][] data = null;
	
	
	@DataProvider
	public Object[][] testData(Method m) {
		
		if(m.getName().equals("test")) {
			
			
			data = new Object [][] {
				
				{"admin1","admin@123"},
				{"admin","admin@1234"},
				{"admin2","admin!123"}
					
			};
			
			}
		if(m.getName().equals("test1")) {
			
			
			data = new Object [][] {
				
				{"hello","hello","heakdjsk"}
				
				
			};
			
		}
		
		return data;
	}
	
	
}
