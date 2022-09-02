package day3.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentis {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://sampleapp.tricentis.com/101/");
		
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		System.out.println("Page title status: "+pageTitle.equals("Tricentis Vehicle Insurance"));
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page URL is: "+pageURL);
		System.out.println("Page URL status: "+pageURL.equals("http://sampleapp.tricentis.com/101/"));
		String pageContent=driver.getPageSource();
		System.out.println("Page Source is: "+pageContent);
		System.out.println("Page Source length: "+pageContent.length());
		
		driver.close();

	}

}
