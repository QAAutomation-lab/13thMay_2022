package testngsamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void setUp() {
		System.out.println("Open browser and login into application");
	}
	@Test(priority=1)
	public void taskCreation() {
		System.out.println("Create new task");
	}
	@Test(priority=2)
	public void deleteTask() {
		System.out.println("Delete new task");
	}
	@AfterTest
	public void cleanUp() {
		System.out.println("logout and close browser");
	}
}
