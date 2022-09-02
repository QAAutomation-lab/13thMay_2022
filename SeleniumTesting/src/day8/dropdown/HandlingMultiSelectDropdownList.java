package day8.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		//**** Idetify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectSkill=new Select(carDropdown);
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
//		//**** get default or already select option
//		//WebElement selectedOption=selectSkill.getFirstSelectedOption();
//		//String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selectec option name: "+selectSkill.getFirstSelectedOption().getText());
		
		//get option count 
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		 
		//select options from dropdown
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(2);
		selectSkill.selectByIndex(3);
//		selectSkill.selectByValue("Hyundaix");
//		selectSkill.selectByVisibleText("Audi");
		
		//get all the selected options
		List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
		System.out.println("Selected car count: "+selectCars.size());
		
		//unselect already select options
//		selectSkill.deselectByIndex(0);
//		selectSkill.deselectByValue("Hyundaix");
//		selectSkill.deselectByVisibleText("Audi");
				//or
		selectSkill.deselectAll();
	}
}
