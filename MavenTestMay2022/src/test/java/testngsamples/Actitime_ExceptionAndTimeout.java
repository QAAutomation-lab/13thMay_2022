package testngsamples;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Actitime_ExceptionAndTimeout {
		
	/**
	 * when you catch the exception at test case level
	 */
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZeroExample1(){
		System.out.println("Exception test");
		int e = 1/0;
		System.out.println("Exception handling done");
	}
	@Test(timeOut=1000) // specify time in milliseconds
	public void executetimeOut() throws InterruptedException{
		//Thread.sleep(3000);
             // Thread.sleep(500);
	}

}
