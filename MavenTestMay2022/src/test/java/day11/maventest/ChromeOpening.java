package day11.maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class ChromeOpening {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.ecatering.irctc.co.in/");

		driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();

		WebElement trainNum = driver
				.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']"));
		s1.waitTillElementIsClickable(trainNum);
		trainNum.sendKeys("12627");

		WebElement selectTrain = driver.findElement(By.xpath("//div[div[span[text()='Trains']]]/button"));
		s1.waitTillElementIsClickable(selectTrain);
		selectTrain.click();

		driver.findElement(By.name("date")).click();

		for (int i = 0; i < 5; i++) {
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		
		Select select=new Select(driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")));
		
		select.selectByVisibleText("Yelhanka Jn - YNK");
	}
}
