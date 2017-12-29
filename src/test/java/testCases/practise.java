package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class practise {
	 static WebDriver driver;
	 
	@BeforeMethod
	public void beforemethod(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
  
	@Test
  public void testcase1() throws Exception 
	{
		
		File f = new File("C:\\Users\\zubairhussains\\workspace\\TestPractise\\src\\test\\java\\config_File\\test.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		
	  //go to url
	  driver.get(pro.getProperty("url"));
	  //click on signin 
	  driver.findElement(By.xpath("//div[@class='header_user_info']//a")).click();
	  //do login 
	  driver.findElement(By.id("email")).sendKeys(pro.getProperty("Username"));;
	  driver.findElement(By.id("passwd")).sendKeys(pro.getProperty("Password"));
	  driver.findElement(By.name("SubmitLogin")).click();
	  
	  // go to T-shirts tab
	  driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
	  //Using actions class to get hidden element
	  //go to t shirt image 
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]")), 97, 16).build().perform();
	  //click on ADD TO CART
	  driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	  //click on proceed to checkout
	  driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
	  //enter the quantity
	  WebElement quantity=driver.findElement(By.xpath(".//*[@id='product_1_1_0_42112']/td[5]/input[2]"));
	  quantity.clear();
	  quantity.sendKeys(pro.getProperty("Q"));
	  
	  Thread.sleep(2000);
	  String size=quantity.getAttribute("value");
	  
	  //compare the result
	  String a = pro.getProperty("Q");
	  
	  if(size.equals(a)){
		  System.out.println("quantity matched is" +size);
	  }else{
		  System.out.println("quantity not matched" + size);
	  }
	  driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
	  driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
	}
	

	@Test
	public void testcase2() throws Exception
	{
		File f = new File("C:\\Users\\zubairhussains\\workspace\\TestPractise\\src\\test\\java\\config_File\\test.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		  driver = new FirefoxDriver();
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
		 
	}
	  //close the browser
	  @AfterMethod
	  public void closeBrowser(){
	  driver.close();
	  
	  
	    
  }
  
}
