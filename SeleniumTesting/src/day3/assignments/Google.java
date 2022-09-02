package day3.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String pageTitle=driver.getTitle();
		System.out.println("Page title: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		System.out.println("Page title validation status: "+pageTitle.equals("Google"));
		
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page URL: "+pageURL);
		System.out.println("Page URL validation status: "+pageURL.equals("https://www.google.com/"));
		
		String pageContent=driver.getPageSource();
		System.out.println("Page source length: "+pageContent.length());
		
		driver.close();
	}

}
