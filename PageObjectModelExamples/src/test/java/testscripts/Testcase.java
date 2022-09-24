package testscripts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://techextensor.com/");
		WebDriverWait wait=new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		WebElement element=driver.findElement(By.xpath("(//a[text()='Our Work'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		List<WebElement> totalGrid=driver.findElements(By.cssSelector("#clients-grid>div"));
		List<WebElement> projectName = driver.findElements(By.xpath("//div[@class='expand']/h5"));
		List<WebElement> ProjectURL = driver.findElements(By.xpath("//a[@target='_blank' and contains(@href,'portfolio/')]"));
		String mainPage=driver.getWindowHandle();
		for(int i=0;i<projectName.size();i++) {
			System.out.print(projectName.get(i).getAttribute("innerHTML")+"\t||");
			System.out.print(ProjectURL.get(i).getAttribute("href")+"\t||");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", totalGrid.get(i));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(totalGrid.get(i)));
			totalGrid.get(i).click();
			Set<String> allWins=driver.getWindowHandles();
			String childWin=null;
			if(allWins.size()==2) {
			allWins.remove(mainPage);
			childWin=allWins.iterator().next();
			}
			driver.switchTo().window(childWin);
			driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
			List<WebElement> gridNames=driver.findElements(By.cssSelector("#clients-grid img"));
			System.out.println(gridNames.size());
			driver.close();
			driver.switchTo().window(mainPage);
			projectName = driver.findElements(By.xpath("//div[@class='expand']/h5"));
			ProjectURL = driver.findElements(By.xpath("//a[@target='_blank' and contains(@href,'portfolio/')]"));
		}
	}
}
