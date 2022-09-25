package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.SeleniumUtility;

public class GoogleSearchStepDef extends SeleniumUtility{


    @Given("^User has already on google search page$")
    public void user_has_already_on_google_search_page() {
        setUp("chrome", "https://www.google.com");
    }

    @When("^user types (.+) in search input field and press enter key$")
    public void user_types_in_search_input_field_and_press_enter_key(String texttobesearched) {
        driver.findElement(By.name("q")).sendKeys(texttobesearched,Keys.ENTER);
    }

    @Then("^User should able to get result page with title having (.+)$")
    public void user_should_able_to_get_result_page_with_title_having(String texttobesearched) {
        Assert.assertTrue(getCurrentTitleOfApplication(texttobesearched).equals(texttobesearched));
    }
}
