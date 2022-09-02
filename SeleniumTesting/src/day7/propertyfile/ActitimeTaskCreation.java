package day7.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTaskCreation {

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
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing2");
		
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();
		
		driver.findElement(By.cssSelector(".createdTasksRowsTable tr:nth-of-type(1) .img")).click();

	}

}
