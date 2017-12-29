package testCases;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import config_File.Screenshot;

public class HowToTakeScreenshot {
	
 static	WebDriver driver;
	
	
  @Test
  public void screenshot() {
	  
	driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	
	Screenshot.getScreenShot("Step-1",driver);
	

  }
}
