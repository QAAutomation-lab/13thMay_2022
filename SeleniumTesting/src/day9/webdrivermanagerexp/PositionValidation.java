package day9.webdrivermanagerexp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionValidation {

	/**
	 * Open a browser and enter actitime application URL 
	 * click on login button with entering username and password
	 * validate in error msg "Username or Password is invalid. Please try again." is displayed in red color
	 * above the username field
	 */
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebElement errorMsg =driver.findElement(By.cssSelector(".errormsg"));
		
		System.out.println("Error msg: "+errorMsg.getText());
		System.out.println("Error msg text color: "+errorMsg.getCssValue("color"));

		Point locationOfErrorMsg=errorMsg.getLocation();
		int errorMsgX=locationOfErrorMsg.getX();
		int errorMsgY=locationOfErrorMsg.getY();
		System.out.println("Error X cord: "+errorMsgX);
		System.out.println("Error Y cord: "+errorMsgY);
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		Point locationUsername=usernameInputField.getLocation();
		int usernameX=locationUsername.getX();
		int usernameY=locationUsername.getY();
		System.out.println("Username X cord: "+usernameX);
		System.out.println("Username Y cord: "+usernameY);
		
		int pwdY=driver.findElement(By.name("pwd")).getLocation().getY();
		System.out.println("Pwd y: "+pwdY);
		int pwdX=driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println("Pwd x: "+pwdX);

		System.out.println("is Error msg getting displayed above the username field? "+(errorMsgY<usernameY));

	}

}
