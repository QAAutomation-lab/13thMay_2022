package day19.exceptionhandling;
// Throwing Unchecked Exception
public class ExceptionHandling10 {   
    //function to check if person is eligible to vote or not   
    public static void validateAge(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){ 
    	//Without handling exception
    	//validateAge(13);
        //handling exception, calling the function  
    	try {
    		validateAge(13);
    	}catch(ArithmeticException e) {
    		System.out.println("Exception handled...");
    		System.out.println(e);
    	}
        System.out.println("rest of the code...");    
  }    
}    