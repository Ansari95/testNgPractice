
package org.TestNgRevision.Testngrevision;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteraizedTest {

	@Test
	@Parameters({"username","password"})
	public void loginFunction(String username, String password) {
		
		System.out.println(username + password);
		
		
	}
	
	
}
