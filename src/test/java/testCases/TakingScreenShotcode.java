package testCases;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config_File.Config;
import config_File.Configexcel;
import config_File.Screenshot;

public class TakingScreenShotcode {
WebDriver driver;
	
	
	@BeforeMethod
	public void launchbrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test(groups={"Smoke"})
	public void testcase_1() throws Exception {
		
		Properties pro =Config.config_Reader();
		
		String username=Configexcel.config_excelreader(0, 0, 1);
		String password=Configexcel.config_excelreader(0, 1, 1);
		
		// Open the Application & enter the username, password then click on login button
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath("//div[@class='header_user_info']//a")).click();
				
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.name("SubmitLogin")).click();
				
		// go to T-shirts tab
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
		
		// Using actions class to get hidden element
		// go to t shirt image
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]")), 97, 16).build().perform();
		
		// click on ADD TO CART
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		
		// click on proceed to checkout
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		
		// enter the quantity
		WebElement quantity = driver.findElement(By.xpath(".//*[@id='product_1_1_0_42112']/td[5]/input[2]"));
		quantity.clear();
		quantity.sendKeys(pro.getProperty("Q"));

		Thread.sleep(2000);
		String size = quantity.getAttribute("value");

		// compare the result
		String a = pro.getProperty("Q");

		if (size.equals(a)) {
			System.out.println("quantity matched is " + size);
		} else {
			System.out.println("quantity not matched " + size);
		}
		driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
		
	}
	@Test(groups={"Regression"})
	public void testcase_2() throws Exception {
		
		Properties pro =Config.config_Reader();
		
		String username=Configexcel.config_excelreader(0, 0, 1);
		String password=Configexcel.config_excelreader(0, 1, 1);
		
		// Open the Application & enter the username, password then click on login button
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath("//div[@class='header_user_info']//a")).click();
				
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.name("SubmitLogin")).click();
				
		// go to T-shirts tab
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
		
		// Using actions class to get hidden element
		// go to t shirt image
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]")), 97, 16).build().perform();
		
		// click on ADD TO CART
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		
		// click on proceed to checkout
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		
		// enter the quantity
		WebElement quantity = driver.findElement(By.xpath(".//*[@id='product_1_1_0_42112']/td[5]/input[2]"));
		quantity.clear();
		quantity.sendKeys(pro.getProperty("Q"));

		Thread.sleep(2000);
		String size = quantity.getAttribute("value");

		// compare the result
		String a = pro.getProperty("Q");

		if (size.equals(a)) {
			System.out.println("quantity matched is " + size);
		} else {
			System.out.println("quantity not matched " + size);
		}
		driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
		
	}

	@AfterMethod
	public void Screen(ITestResult result){
		if(ITestResult.SUCCESS==result.getStatus());{
			Screenshot.getScreenShot(result.getName(), driver);
	
		}
		driver.close();
	}
	
	
		
	}

	



