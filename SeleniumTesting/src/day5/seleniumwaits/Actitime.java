package day5.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		String expectedTitle="actiTIME - Login";
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		
		//identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin");
		//type password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		
		//explicit wait(static wait)
		Thread.sleep(2000);
			
		//verify home page
		String homePageTitle=driver.getTitle();
		System.out.println("Home page title: "+homePageTitle);
		System.out.println("Home page validation status: "+homePageTitle.equals("actiTIME - Enter Time-Track"));
		//click on logout link
		driver.findElement(By.id("logoutLink")).click();
		//verify login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		//close the browser
		driver.close();
	}
}
/*
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. verify home page
7. click on logout link
8. verify login page is opened or not
9. close the browser
*/

/**
 * In order to perform any operation on any element first identify it from WebPage, for that use findElement()
 * 
 * WebElement element= findElement(By.locator()); --> use to identify the element from the Web page and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */