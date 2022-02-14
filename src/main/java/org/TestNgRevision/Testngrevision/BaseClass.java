package org.TestNgRevision.Testngrevision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

	public static WebDriver driver;
	
	public void ScreenShot(String path) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	
}
