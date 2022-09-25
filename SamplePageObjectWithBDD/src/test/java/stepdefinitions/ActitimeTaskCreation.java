package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class ActitimeTaskCreation extends SeleniumUtility{

	 @When("^click on Tasks tab$")
	    public void click_on_tasks_tab()  {
		 driver.findElement(By.id("container_tasks")).click();
	    }

	    @Then("^user should be able to see the created task on page$")
	    public void user_should_be_able_to_see_the_created_task_on_page()  {
	       WebElement createdTask=driver.findElement(By.xpath("//div[text()='Testing']"));
	       Assert.assertTrue(isElementExist(createdTask), "Task not created");
	    }

	    @And("^click on Add new button$")
	    public void click_on_add_new_button()  {
	    	driver.findElement(By.cssSelector(".addNewButton")).click();
	    }

	    @And("^select New Tasks$")
	    public void select_new_tasks()  {
	    	driver.findElement(By.cssSelector(".createNewTasks")).click();
	    }

	    @And("^select projectr from project dropdown$")
	    public void select_projectr_from_project_dropdown()  {
	    	waitForElementToBeClickable(driver.findElement(By.cssSelector(".projectSelector .selectedItem")));
	    	driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
			
			driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
	    }

	    @And("^enter task name as (.+)$")
	    public void enter_task_name_as(String taskname)  {
	    	driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys(taskname);
	    }

	    @And("^click on Create Tasks button$")
	    public void click_on_create_tasks_button()  {
	    	driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();
	    }
}
