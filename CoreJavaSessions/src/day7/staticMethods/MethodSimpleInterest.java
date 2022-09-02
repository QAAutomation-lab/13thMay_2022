package day7.staticMethods;
public class MethodSimpleInterest
{
    public static void main(String args[]) 
    {
        float principal=2000, rof=6, time=3, interest;
        
        System.out.print("Enter the Principal : "+principal);
       
        System.out.print("Enter the Rate of interest : "+rof);
       
        System.out.print("Enter the Time period : "+time);
       
        interest = (principal * rof * time) / 100;
        System.out.print("Simple Interest is: " +interest);
    }
    /**
     * method ---> static or non-static
     * 		 ---> return or not
     * 		 ---> argument or not
     */
}