package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver",
				"F:\\JavaWorkspace\\SeleniumTesting\\Executables\\IEDriverServer.exe");
		InternetExplorerDriver fdriver = new InternetExplorerDriver();
		fdriver.get("https://www.google.com");
		fdriver.close();
	}
}
