package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class ParallelExecutionTest extends SeleniumUtility {
	
	@Parameters({"browser", "username", "password" })
	@Test
	public void testLoginOfVtiger(String browser,String username, String password) {
			
		if(browser.equalsIgnoreCase("firefox")){
			setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		}else if(browser.equalsIgnoreCase("chrome")){
			setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		}else if(browser.equalsIgnoreCase("ie")){
			setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		}
		driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	}
}
