package day12.swtichstatements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingActiveElements {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/");
		//login into the application without identifying username and password field
		
		//verify mouse pointer is in username input field
		WebElement username=driver.switchTo().activeElement();
		String str=username.getAttribute("placeholder");
		System.out.println("is mouse pointer present in Username input field? "+str.equals("Username"));
		username.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);		
	}
}
