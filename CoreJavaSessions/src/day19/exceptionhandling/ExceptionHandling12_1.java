package day19.exceptionhandling;
//Throwing UserDefinedException 
//class represents user-defined exception  
class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  
public class ExceptionHandling12_1 {

	public static void validateAge(int age) throws UserDefinedException{
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new UserDefinedException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String args[]) {
		
		System.out.println("I am main of ExceptionHandling12_1");
		try {
			validateAge(15);
		} catch (UserDefinedException e) {
			//e.printStackTrace();
			System.out.println(e);
		}	
		System.out.println("Rest of the code..");
	}
}

/**
throw ---> is used to throw explicit exception from a method body, it can be checked or unchecked exception
	  ---> if its a checked exception dn you have handle it by using try-catch block or you can declare that exception
	  	   in method label using throws keyword in this case where ever this method gets called in that method you need
	  	   to handle to exception in order to continue the program

*/