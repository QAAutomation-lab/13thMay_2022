package day7.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWidgets {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// click on signin button
		driver.findElement(By.cssSelector(".buttonBlue")).click();
		
		// click on Widget button
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		// select History
		driver.findElement(By.cssSelector("a[data-name='History']")).click();

		// click on Widget button
		driver.findElement(By.cssSelector(".addButton")).click();
		// select History
		driver.findElement(By.cssSelector(".widgetsList>li:nth-of-type(2)>a")).click();

		// click on Widget button
		driver.findElement(By.cssSelector(".addButton")).click();
		// select History
		driver.findElement(By.cssSelector(".widgetsList>li:nth-of-type(3)>a")).click();
		
		driver.findElement(By.cssSelector("a[name='dclose']")).click();
		driver.findElement(By.cssSelector(".confirm-box-ok")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("a[name='dclose']")).click();
		driver.findElement(By.cssSelector(".confirm-box-ok")).click();
	}
}
