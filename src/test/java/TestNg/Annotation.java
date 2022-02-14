package TestNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {


	@BeforeSuite
	void beforesuite() {
		System.out.println("b.suit");
	}

	@BeforeTest
	void befortest() {
		
		System.out.println("b.test");
	}

	@BeforeClass
	void beforeclass() {
		
		System.out.println("beforeclass");
	}
	@BeforeMethod
	void beforemethod() {
		System.out.println("beforemethod");
	}

	@Test
	void test() {
		System.out.println("Annotation.test()");
		
		
	}

	@AfterMethod
	void aftermethod() {
		
		System.out.println("aftermethod");
	}

	@AfterClass
	void afterclass() {
		
		System.out.println("afterclass");
	}

	@AfterTest
	void afytertest() {
		
		System.out.println("a.test");
	}
	@AfterSuite	
	void suite() {
		
		System.out.println("a.test");
	}
}
