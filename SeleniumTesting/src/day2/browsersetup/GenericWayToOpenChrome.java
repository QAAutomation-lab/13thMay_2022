package day2.browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * 		path: 
		 * 		1. absolute path --> F:\\JavaWorkspace\\SeleniumTesting\\Executables\\chromedriver.exe
		 * 		2. Relative path --> .\\Executables\\chromedriver.exe
		 * Step2: create an instance of required browser class
		 */
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//to enter the url on the open browser
		driver.get("https://www.google.com");
		
		//application title validation
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("Actaul Google page title is: "+actualTitle);
		System.out.println("Expected Google page title is: "+expectedTitle);
		System.out.println("Google title validation: "+actualTitle.equals(expectedTitle));
		
		//validation of url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.google.com";
		System.out.println("Actaul Google page URL is: "+actualUrl);
		System.out.println("Expected Google page URL is: "+expectedUrl);
		System.out.println("Google url validation: "+actualUrl.contains(expectedUrl));
		
		//page source code
		String pageSoucre=driver.getPageSource();
		System.out.println("Page source code content length: "+pageSoucre.length());
		
		//close the current browser
		driver.close();
	}
}
/**
Open chrome browser
enter google URL
validate following things-
	1. validate current url 
	2. validate page title 
	3. get the page source length
*/