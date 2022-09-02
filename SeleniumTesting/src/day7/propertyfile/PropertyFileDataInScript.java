package day7.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileDataInScript {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\TestData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("appUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("loginPageTitle");
		String loginButtonName=prop.getProperty("buttonName");
		
		//System.out.println(driverKey+"\n"+executablePath+"\n"+applicationUrl+"\n"+username+"\n"+password+"\n"+expectedLoginPageTitle+"\n"+loginButtonName);
		
		
		String chromeExePath=System.getProperty("user.dir")+executablePath;
		//setting the path for driver executable
		System.setProperty(driverKey, chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get(applicationUrl);
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedLoginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation status: "+pageUrl.contains(applicationUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source: "+pageSource);
		System.out.println("Page Source length: "+pageSource.length());
	
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(username);
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys(password);
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.close();

	}

}
