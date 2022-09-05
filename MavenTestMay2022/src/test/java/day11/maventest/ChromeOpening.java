package day11.maventest;

import org.openqa.selenium.WebDriver;

import utilities.DateUtility;
import utilities.SeleniumUtility;

public class ChromeOpening {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://www.google.com");
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
		String fileName=".\\src\\test\\resources\\screenshots\\GoogleSearchPage"+date+".png";
		s1.takeScreenshot(fileName);		
		s1.cleanUp();
	}
}
