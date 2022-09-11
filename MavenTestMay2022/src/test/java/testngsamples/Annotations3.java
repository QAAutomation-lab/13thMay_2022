package testngsamples;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotations3 {
	
	@Test(priority=1)
	public void taskCreation() {
		System.out.println("Create new task");
	}
	@Test(priority=2)
	public void deleteTask() {
		System.out.println("Delete new task");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout and close browser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Open browser and login into application");
	}
}
