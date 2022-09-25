package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLeadsPage;
import webpages.VtigerLoginPage;

public class VtigerLeadStepDef extends SeleniumUtility{
	
	VtigerLoginPage getVtigerLoginPage;
	VtigerHomePage getVtigerHomePage;
	VtigerLeadsPage getVtigerLeadsPage;
	WebDriver driver;
	 @Given("^user already in login page$")
	    public void user_already_in_login_page() {
	       driver= setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	       getVtigerLoginPage =new VtigerLoginPage(driver);
	       getVtigerHomePage=new VtigerHomePage(driver);
	       getVtigerLeadsPage=new VtigerLeadsPage(driver);
	    }

	    @When("^click on navigation bar$")
	    public void click_on_navigation_bar() {
	        clickOnElement(getVtigerHomePage.getFlowNavigator());
	    }

	    @Then("^varify lead is created with (.+)$")
	    public void varify_lead_is_created_with(String lastname) {
	    	Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation());
	    }

	    @And("^user login successfully with valid data$")
	    public void user_login_successfully_with_valid_data() {
	        getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	    }

	    @And("^go to Marketing and select Leads$")
	    public void go_to_marketing_and_select_leads() {
	        clickOnElement(getVtigerHomePage.getSelectMarketingOption());
	        clickOnElement(getVtigerHomePage.getSelectLeadsOption());
	    }

	    @And("^click on Add Leads button and enter firstname as (.+) ,last as (.+) ,number as (.+) and click on save button$")
	    public void enter_firstname_as_last_as_number_as_and_click_on_save_button(String firstname, String lastname, String number) {
	       getVtigerLeadsPage.createNewLead(firstname, lastname, number);
	    }


	    @And("^click on All link$")
	    public void click_on_all_link() {
	    	getVtigerLeadsPage.clickOnHeader();
	    }
	    
	    @When("^click on select all leads checkbox$")
	    public void click_on_select_all_leads_checkbox()  {
	    	getVtigerLeadsPage.selectAllLeadsCheckBox();
	    }

	    @Then("^varify that all leads deleted$")
	    public void varify_that_all_leads_deleted()  {
	    	Assert.assertEquals(getVtigerLeadsPage.getLeadsList("class"),"emptyRecordsDiv","Leads are not deleted");
	    }

	    @And("^click on delete logo$")
	    public void click_on_delete_logo()  {
	    	getVtigerLeadsPage.clickOnDeleteLogo();
	    }

	    @And("^user will get a popup to comfirm deletion, select Yes$")
	    public void user_will_get_a_popup_to_comfirm_deletion_select_yes()  {
	    	getVtigerLeadsPage.confirmLeadDeletion();
	    }


}
