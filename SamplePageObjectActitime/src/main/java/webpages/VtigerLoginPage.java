package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility{
	WebDriver driver;
	public VtigerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameInput;
	
	@FindBy(css="#password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginButton;
	
	public void loginInVtiger(String username,String pwd) {
		typeInput(usernameInput, username);
		typeInput(password, pwd);
		clickOnElement(loginButton);
	}
}
