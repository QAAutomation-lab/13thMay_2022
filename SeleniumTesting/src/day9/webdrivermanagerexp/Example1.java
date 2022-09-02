package day9.webdrivermanagerexp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) {
		
//		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
//		// step1: set driver executable path by using System.setProperty(String
//		// key,String value)
//		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
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

	}

}
