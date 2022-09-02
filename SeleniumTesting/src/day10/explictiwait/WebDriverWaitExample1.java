package day10.explictiwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicit wait(dynamic wait)
		WebDriverWait wait=new WebDriverWait(driver,20);
		//identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin");
		//type password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		//wait for Logout link to be loaded in the page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title: "+driver.getTitle());		
		
		//add condition to wait using WebDriverWait instance
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
		
		//click on logout link
		WebElement logoutLink=driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		
		//close the browser
		driver.close();
	}
}
