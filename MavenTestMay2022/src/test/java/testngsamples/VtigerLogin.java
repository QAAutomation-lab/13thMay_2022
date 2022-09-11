package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilites.BaseUtil;

public class VtigerLogin extends BaseUtil {

	@DataProvider
	public Object[][] getCred() {
		Object[][] obj = new Object[3][3];
		// row1
		obj[0][0] = "chrome";
		obj[0][1] = "admin";
		obj[0][2] = "Test@123";
		// row2
		obj[1][0] = "firefox";
		obj[1][1] = "admin3";
		obj[1][2] = "@123";
		// row3
		obj[2][0] = "";
		obj[2][1] = "";
		obj[2][2] = "";
		return obj;
	}
//	@Test(dataProvider="getCred")
//	public void testDataProvider(String br,String un,String pwd) {
//		System.out.println(br);
//		System.out.println(un);
//		System.out.println(pwd);
//	}
	
	@Test(dataProvider="getCred")
	public void loginInVtiger(String br,String un,String pwd) {
		setUp(br, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pwd, Keys.ENTER);
		driver.close();
	}

//	@Test
//	public void testLoginOfVtiger_valid() {
//		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("Test@123", Keys.ENTER);
//		driver.close();
//	}
//
//	@Test
//	public void testLoginOfVtiger_invalid() {
//		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("213admin");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("@123", Keys.ENTER);
//		driver.close();
//	}
//
//	@Test
//	public void testLoginOfVtiger_empty() {
//		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("", Keys.ENTER);
//		driver.close();
//	}
}
