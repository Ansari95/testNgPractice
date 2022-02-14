package org.TestNgRevision.Testngrevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Invocation_Count {
	
	WebDriver driver;
	
	@BeforeSuite
	public void LanchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}

	
	@Test(invocationCount = 3, invocationTimeOut = 20000)
	public void openGoogle() {
		
		driver.get("https://www.google.com/");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
	
}
