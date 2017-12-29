package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demo1 {

	
	@Test
	public void test1() throws FileNotFoundException,Exception
	{
		File f = new File("C:\\Users\\zubairhussains\\workspace\\TestPractise\\src\\test\\java\\config_File\\test.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		  //go to url
		  driver.get(pro.getProperty("url"));
		  
		  //click on signin 
		  driver.findElement(By.xpath("//div[@class='header_user_info']//a")).click();
		  
		  //do login 
		  driver.findElement(By.id("email")).sendKeys(pro.getProperty("Username"));;
		  driver.findElement(By.id("passwd")).sendKeys(pro.getProperty("Password"));
		  driver.findElement(By.name("SubmitLogin")).click();
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")), 97, 16).build().perform();
		  
		  driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")).click();
		 
		  action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]")), 97, 16).build().perform();
		  driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		  
		  Thread.sleep(1000);
		  WebElement msg=driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[1]/h2"));
		  System.out.println("!!!!"+msg.getText());
		  
		  if( msg.isDisplayed()){
			  driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
			  System.out.println("Test case is passed");
		  }else{
			  System.out.println("Test failed");
		  }
		 driver.close();
	}

	
}
