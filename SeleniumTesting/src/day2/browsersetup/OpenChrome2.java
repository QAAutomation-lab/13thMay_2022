package day2.browsersetup;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome2 {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * 		path: 
		 * 		1. absolute path --> F:\\JavaWorkspace\\SeleniumTesting\\Executables\\chromedriver.exe
		 * 		2. Relative path --> .\\Executables\\chromedriver.exe
		 * Step2: create an instance of required browser class
		 */
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		System.out.println("Current working dir: "+currentWorkingDir);
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		//close the current browser
		cdriver.close();
	}
}
