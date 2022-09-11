package testngsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseDependency {
	
	WebDriver driver;
	@BeforeTest
	public void startUp(){
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();		
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				
			driver.get("https://www.google.com/");		
	}
  @Test
  public void testGoogleLandingPage() {			
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		//System.out.println(expectedTitle.equals(actualTitle));
		Assert.assertTrue(expectedTitle.equals(actualTitle), "Google title validation is failed");
		/**
		 * Assert.assertTrue(condition)
		 * Assert.assertTrue(condition,"Msg")
		 * Assert.assertEqual(expTitle,actTitle)
		 * Assert.assertEqual(expTitle,actTitle,"MSG")
		 */
  }
  @Test(dependsOnMethods="testGoogleLandingPage")
  public void testSearch(){
	  
		driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		System.out.println(driver.getTitle());
  }
  @AfterTest
  public void cleanUp(){
	  driver.close();
  }

}
