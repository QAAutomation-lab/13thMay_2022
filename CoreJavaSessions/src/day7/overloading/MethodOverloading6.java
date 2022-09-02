package day7.overloading;
/**
 * what if return type, method name and argument list are same.-- compile time error
 */
public class MethodOverloading6
{
   public int myMethod(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public int myMethod(int var1, int var2)
   {
       System.out.println("Second myMethod of class Demo");
       return var1-var2;
   }

   public static void main(String args[])
   {
       MethodOverloading6 obj1= new MethodOverloading6();
       obj1.myMethod(10,10);
       obj1.myMethod(20,12);
   }
}
