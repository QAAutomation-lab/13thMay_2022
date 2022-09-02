package day10.explictiwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample2 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.gecko.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new FirefoxDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//identify and perform required operation
		driver.findElement(By.id("identifierId")).sendKeys("shailesh13.de");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		//explicit wait(dynamic wait)
		WebDriverWait wait=new WebDriverWait(driver,20);
		//add condition to wait using WebDriverWait instance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
		
		driver.findElement(By.name("Passwd")).sendKeys("abc@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//close the browser
		//driver.close();
	}
}
