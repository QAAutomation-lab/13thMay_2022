package day19.exceptionhandling;

public class ExceptionHandling15  
{  
    // defining a user-defined method  which throws ArithmeticException  
    static void method()
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
    //main method  
    public static void main(String args[])  
    {  
    	 //method();
        try  
        {  
            method();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("caught in main() method");  
        }  
    	 System.out.println("Rest of the code");
    }  
}  