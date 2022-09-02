package day7.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmPagi {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.gsmarena.com/tecno-phones-120.php");
		
		List<WebElement> paginationLinks=driver.findElements(By.cssSelector(".nav-pages>a"));
		if(paginationLinks.size()>0) {
			System.out.println("Pagination exist");
		}else {
			System.out.println("Pagination not exist");
		}
		//print links
		for(WebElement element: paginationLinks) {
			System.out.println(element.getText());
		}
		System.out.println(driver.getCurrentUrl());
		//every page URL
		for(int i=0;i<paginationLinks.size();i++) {
			
			paginationLinks.get(i).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			//to avoid staleElementExection identify the pagination link
			paginationLinks=driver.findElements(By.cssSelector(".nav-pages>a"));
		}
	}
}
