package testngsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperNG {
	
	public  WebDriver driver;
	public  Actions action;
	public   WebDriverWait wait;
	
	@BeforeMethod
	public void setUp(){
		startUp("chrome","https://demo.vtiger.com/");
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
	}
	/**
	 * 
	 * @param browserType
	 * @param appUrl
	 */
	public void startUp(String browserType,String appUrl){
		if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", 
					"E:\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
						driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", 
					"E:\\Selenium Softwares\\geckodriver-v0.22.0-win32\\geckodriver.exe");
						driver=new FirefoxDriver();
		}else{
			System.setProperty("webdriver.ie.driver", 
					"E:\\Selenium Softwares\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
						driver=new InternetExplorerDriver();
		}		
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					wait=new WebDriverWait(driver,20);
					action=new Actions(driver);
					driver.get(appUrl);
		}
	@AfterMethod
	public  void tearDown(){
		driver.close();
	}

}
