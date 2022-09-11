package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilites.BaseUtil;


public class ParallelExecutionTest extends BaseUtil {
	
	@Parameters({"browser", "username", "password" })
	@Test
	public void testLoginOfVtiger(String browser,String username, String password) {
			
		if(browser.equalsIgnoreCase("ff")){
			setUp(browser, "https://demo.vtiger.com/");
		}else if	(browser.equalsIgnoreCase("gc")){
			setUp(browser, "https://demo.vtiger.com/");
		}else if	(browser.equalsIgnoreCase("ie")){
			setUp(browser, "https://demo.vtiger.com/");
		}
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	}
}
