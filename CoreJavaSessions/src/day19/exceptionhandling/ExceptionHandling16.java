package day19.exceptionhandling;
import java.util.Scanner;
public class ExceptionHandling16 {
	    public static void main(String[] args)
	    {
	    	System.out.println("program starts");
	    	//setSleep(3000);
	    	checkNumber(-1);
	        System.out.println("Hello Geeks");
	    }
	    static void setSleep(long time) {
	    	try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    static void checkNumber(int num) {
	    	if(num<0){
	    		try {
					throw new UserDefinedException("Number less dn zero");
				} catch (UserDefinedException e) {
					e.printStackTrace();
				}
	    	}else {
	    		System.out.println("Number is :"+num);
	    	}
	    }
}
/**
try-catch--> to handle the exception
throw------> to throw the exception from a method body, this needs to handled by using throws 
throws------> use to handle exception throws by a method while calling or use to declare a exception on method level
*/