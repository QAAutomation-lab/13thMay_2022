package day3.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeCRM {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login page validation
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		System.out.println("Page title status: "+pageTitle.equals("OrangeHRM"));
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page URL is: "+pageURL);
		System.out.println("Page URL status: "+pageURL.contains("https://opensource-demo.orangehrmlive.com/"));
		String pageContent=driver.getPageSource();
		//System.out.println("Page Source is: "+pageContent);
		System.out.println("Page Source length: "+pageContent.length());
		
		//identify and type user name as Admin
		WebElement usernameInputField=driver.findElement(By.name("username"));
		usernameInputField.sendKeys("Admin");
					
		WebElement passwordInputField=driver.findElement(By.name("password"));
		passwordInputField.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
		loginButton.click();
		
		//validate home page
		String homePageUrl=driver.getCurrentUrl();
		System.out.println("Home validation status: "+homePageUrl.contains("viewEmployeeList"));
	
		driver.close();		
	}
}
