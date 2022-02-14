package TestNg;

import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	void openGoogle() {
		System.out.println("google open");
		
	}
	
	@Test
	void openYahoo() {
		
		System.out.println("open yahoo");
	}

}
