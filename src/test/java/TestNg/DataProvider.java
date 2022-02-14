package TestNg;

import org.testng.annotations.Test;

public class DataProvider {
	
	
	@org.testng.annotations.DataProvider(name ="testData")
	public Object[][] TestData() {
		
		Object [][]data =  new Object[][]
				{
			{"username", "password"},
			{"admin", "admon@123"}
			
				};
				
				return data;
	}
	
	@Test(dataProvider = "testData")
	void testCase(String username , String password) {
		
		System.out.println(username + password);
		
	}

}
