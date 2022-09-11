package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VtigerApplicationTesting extends SuperNG {
	
	@Test
	public void testLandingOfVtiger(){
		
		String expectedTitle="Dashboard";
		String actualTitle=driver.getTitle();
		Assert.assertTrue(expectedTitle.equals(actualTitle), 
						"Landing page title is not matching with 'Dashboard'");
		Assert.assertEquals(actualTitle,expectedTitle, 
				"Landing page title is not matching with 'Dashboard'");
	}
	
	@Test
	public void testCalenderPage(){
		driver.findElement(By.cssSelector("a[title='Calendar']")).click();
		
		String expectedTitle="Calendar";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle, 
				"Calendar page title is not matching with 'Calendar'");
	}

}










