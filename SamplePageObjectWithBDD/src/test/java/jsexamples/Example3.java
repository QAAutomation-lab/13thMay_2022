package jsexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example3 extends SeleniumUtility{

	@Test
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
		js.executeScript("window.scrollBy(0,2500)");
		
		js.executeScript("window.scrollBy(0,-2500)");
		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy(500,0)");
		
	}
}
