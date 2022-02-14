package org.TestNgRevision.Testngrevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertExample {
	
	public static WebDriver driver;
	
	@Test
	public void verifyTitile(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String expectedValue = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ActulaResult = driver.getTitle();
		Assert.assertEquals(expectedValue, ActulaResult);
		driver.close();
		}
	
	
	
	

	
	
}
