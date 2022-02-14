package org.TestNgRevision.Testngrevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	public static WebDriver driver;

	public void verifytitle()

	{	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	String expectTitle = "Facebook - உள்நுழையவும் அல்லது பதிவுசெய்யவும்";

	String actualTitle = driver.getTitle();

	SoftAssert object = new SoftAssert();
	object.assertEquals(expectTitle, actualTitle);
	object.assertAll();



	


	}


}
