package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username","password"})
	void testing(String username , String password) {
		
		System.out.println(username + password);
	}
}
