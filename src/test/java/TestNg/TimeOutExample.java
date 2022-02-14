package TestNg;

import org.testng.annotations.Test;

public class TimeOutExample {
	
	@Test(timeOut = 5000)
	void timeOUtexample() throws InterruptedException {
		
		
		Thread.sleep(6000);
		System.out.println("time out example");
		
	}

}
