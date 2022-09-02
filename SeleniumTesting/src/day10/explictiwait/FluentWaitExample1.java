package day10.explictiwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample1 {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin");
		// type password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click on login button
		driver.findElement(By.id("loginButton")).click();
		
		//fluent Wait declaration
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title: "+driver.getTitle());

	}

}

/*
 * Wait wait=new FluentWait(WebDriver ref) 
  .withTimeout(timeout.SECONDS)
  .pollingEvery(timeout.SECONDS) 
  .ignoring(Exception.class); //OR 
  
  Wait wait=new FluentWait(WebDriver ref) 
  .withTimeout(Duration.ofSeconds(SECONDS))
  .pollingEvery(Duration.ofSeconds(SECONDS))  
  .ignoring(Exception.class);
 * 
 * 
 */