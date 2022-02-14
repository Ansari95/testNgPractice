package TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreAnnotation {
	
	@Ignore
	@Test
	void ignoreTest() {
		
		System.out.println("ignore test");
	}
	
	@Test
	void ignoreTestExample() {
		
		System.out.println("ignore test");
	}

}
