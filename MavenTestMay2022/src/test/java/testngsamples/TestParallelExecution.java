package testngsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilites.BaseUtil;


public class TestParallelExecution  extends BaseUtil{
	
	
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		/*implicit wait*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*maximize browser window*/
		driver.manage().window().maximize();
	}
	
	@Test
	public void testLoginOfVtiger() {	
			driver.get("https://demo.vtiger.com/");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	}
	
	@Test
	public void testLoginOfActitime() {
		driver.get("https://demo.actitime.com/");		 
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(Keys.ENTER);
	}
}
