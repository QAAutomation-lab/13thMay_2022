package day7.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.findElement(By.cssSelector("a[class='content tasks']")).click();
		
		//driver.close();
	}
}

/**
 * In order to perform any operation on any element first identify it from WebPage, 
 * for that use findElement()
 * 
 * WebElement element= driver.findElement(By.locator()); --> use to identify the element from the Web page 
 * 														and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */
