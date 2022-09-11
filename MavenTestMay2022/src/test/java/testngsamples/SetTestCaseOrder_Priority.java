package testngsamples;

import org.testng.annotations.Test;

public class SetTestCaseOrder_Priority {
	
	 @Test(priority=2)
	  public void testCaseLogin() {
		  
		  System.out.println("testCaseLogin is executed successfully");
	  }
	  @Test(priority=1)
	  public void testCaseSignup() {
		  System.out.println("testCaseSignup is executed successfully");
	  }
	  
	  @Test(priority=3)
	  public void testCaseDeletion() {
		  System.out.println("testCaseDeletion is executed successfully");
	  }
	  
	  @Test(priority=5)
	  public void testCaseCreation() {
		  System.out.println("testCaseCreation is executed successfully");
	  }
	  

}
