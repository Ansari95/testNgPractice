package TestNg;

import org.testng.annotations.Test;

public class ExceptionIntesttng {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	void exceptionHandling() {
		
		int i = 10/0;
		System.out.println(i);
		System.out.println("exception handling example");
		
	}

}
