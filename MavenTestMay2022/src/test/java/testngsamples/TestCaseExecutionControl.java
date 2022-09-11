package testngsamples;

import org.testng.annotations.Test;

public class TestCaseExecutionControl {

	 @Test(priority=1,enabled=true)
	  public void testCaseLogin() {
		  
		  System.out.println("testCaseLogin is executed successfully");
	  }
	  @Test
	  public void testCaseSignup() {
		  System.out.println("testCaseSignup is executed successfully");
	  }
	  
	  @Test(enabled=false)
	  public void testCaseDeletion() {
		  System.out.println("testCaseDeletion is executed successfully");
	  }
	  
	  @Test(priority=5,enabled=true)
	  public void testCaseCreation() {
		  System.out.println("testCaseCreation is executed successfully");
	  }
	  
}
