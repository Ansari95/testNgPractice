package org.TestNgRevision.Testngrevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitAnnotationExample {
	
	WebDriver driver;
	
	long starttime;
	long endtime;
	
	@BeforeSuite
	public void lanchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\Drivers\\chromedriver.exe");
		starttime = System.currentTimeMillis();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void openGoogle() {
		
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void openYahoo() {
		
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
		driver.quit();
		
		
	}
	
	
	
	
}
