package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.SeleniumUtility;

public class ActitimeStepDef extends SeleniumUtility{

	WebDriver driver;
	@Given("^user in on actitime login page$")
	public void user_in_on_actitime_login_page() {
		driver=setUp("chrome", "https://demo.actitime.com/login.do");
	}

	@When("^user enters username as (.+) in the username field$")
	public void user_enters_username_as_in_the_username_field(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Then("^user should get page title as (.+)$")
	public void user_should_get_page_title_as(String title) {
		Assert.assertEquals(title, getCurrentTitleOfApplication(title),"Login Page validation failed");
	}

	@And("^user enters password as (.+) in password field$")
	public void user_enters_password_as_in_password_field(String password) {
		driver.findElement(By.name("pwd")).sendKeys(password);
	}

	@And("^clicks on Login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}
	
	@And("^close the browser$")
	public void close_the_browser() {
		cleanUp();
	}
}
