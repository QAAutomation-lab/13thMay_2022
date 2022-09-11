package testngsamples;

import org.testng.annotations.Test;

public class MultipleTestMethodInClass {
		  @Test
		  public void testCaseLogin() {
			  
			  System.out.println("testCaseLogin is executed successfully");
		  }
		  @Test
		  public void testCaseSignup() {
			  System.out.println("testCaseSignup is executed successfully");
		  }
		  
		  @Test
		  public void testCaseDeletion() {
			  System.out.println("testCaseDeletion is executed successfully");
		  }
		  
		  @Test
		  public void testCaseCreation() {
			  System.out.println("testCaseCreation is executed successfully");
		  }
		  
		 
}
