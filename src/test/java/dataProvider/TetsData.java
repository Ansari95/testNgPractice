package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TetsData {
	
	Object [][] data = null;

	@DataProvider(name = "testData")
	Object[][] testData(Method m) {
		
		if(m.getName().equals("login"))
		data = new Object[][] {
			{"username","password"},
			{"admin","admin@123"}
			
		};
		
		if(m.getName().equals("browser")) {
			
		
				data = new Object[][] {
					{"username","password","admon"},
					{"admin","admin@123","adfdsf"}
					
			
		};
	
		
			}
		return data;
}
	
}
