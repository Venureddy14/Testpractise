package testCases;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config_File.Config;

public class WindowHandle {
	 WebDriver driver;
  @BeforeMethod
  public void launchbrowser() {
	  driver=new FirefoxDriver();
	  driver.get("http://learn-automation.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  @Test
  public void verifyChildWindowName() {
	  Properties pro=Config.config_Reader();
	  driver.findElement(By.xpath("//li[@id='menu-item-3199']/a")).click();
	  
	  //get parent window handle
	  String parentWindow=driver.getWindowHandle();
	  driver.findElement(By.xpath("//a[@href='http://learn-automation.com/selenium-online-training/']")).click();
//	  for (String Child_Window : driver.getWindowHandles()){
//		  driver.switchTo().window(Child_Window);
//		  String childWindowtiltle=driver.getTitle();
//		  System.out.println(childWindowtiltle);
//		 Assert.assertEquals(pro.getProperty("childwindowtitle"), childWindowtiltle);
//		  
//	  }
	  		Set<String> s =driver.getWindowHandles();
	  		
	  		Iterator<String> itr = s.iterator();
	  		while(itr.hasNext())
	  		{
	  			String child_window =itr.next();
	  			if(!parentWindow.equals(child_window))
	  			{
	  				driver.switchTo().window(child_window);
	  			  String childWindowtiltle=driver.getTitle();
	  			  System.out.println(childWindowtiltle);
	  			 Assert.assertEquals(pro.getProperty("childwindowtitle"), childWindowtiltle);
	  			}
	  		}
	  
	  driver.switchTo().window(parentWindow);
	  driver.findElement(By.xpath("//*[@id='menu-item-3890']/a")).click();
  }
  @AfterMethod
  public void closebrowser() {
	  System.out.println("Test Passed");
	  driver.close();
  }

}
