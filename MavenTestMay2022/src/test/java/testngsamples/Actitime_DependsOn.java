package testngsamples;
import org.testng.annotations.Test;
public class Actitime_DependsOn {

	@Test(enabled=true)
	public void openBrowserAndAppURL() {
		int i=10/0;
		System.out.println("Open browser and enter app url");
	}
	@Test(enabled=true, dependsOnMethods="openBrowserAndAppURL")
	public void login() {
		System.out.println("enter username, password and click on login button");
	}
	@Test(enabled=true)
	public void createTask() {
		System.out.println("create new task");
	}
	@Test(enabled=true)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
