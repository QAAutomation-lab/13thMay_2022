package day12.swtichstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingFrame {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		//Step1: identify frame 
		//WebElement frameObject=driver.findElement(By.cssSelector(".demo-frame"));
		//step2: switch your control from main page to frame
		//driver.switchTo().frame(frameObject);
					//or instead of WebElement user index to switch
		driver.switchTo().frame(0);
		//now you are allowed to identify any element and perform required operation on it
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		SeleniumUtility.action.dragAndDrop(src, target).perform();
		//in order to perform any required action on the main page element, switch back to main page first
		driver.switchTo().defaultContent();
		//now your control is in main page
		driver.findElement(By.cssSelector(".logo")).click();

	}

}
